using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace WsdlEnumGenerator
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                var packageName = args[0];
                
                var svcUrl = args[1];
                
                ProcessWsdl(svcUrl, packageName);
            }
            catch (Exception ex)
            {
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine("Error: {0}", ex);
                Console.ResetColor();
            }
        }

        private static void ProcessWsdl(string svcUrl, string packageName)
        {
            var packagePath = packageName.Replace(".", "\\");

            var xsdDoc = XDocument.Load(svcUrl + "?singleWsdl");
            
            XNamespace ns = "http://www.w3.org/2001/XMLSchema";
            
            var simpleTypes = xsdDoc.Descendants(ns + "simpleType");

            var packageDirectory = Path.Combine(@"com\microsoft\bingads", packagePath);
            if (!Directory.Exists(packageDirectory))
            {
                // Create the directory it does not exist.
                Directory.CreateDirectory(packageDirectory);
            }
            
            foreach (var x in
                from simpleType in simpleTypes                
                let list = simpleType.Element(ns + "list")
                where list != null
                let innerSimpleType = list.Element(ns + "simpleType")
                where innerSimpleType != null
                let restriction = innerSimpleType.Element(ns + "restriction")
                where restriction != null
                let name = (string)simpleType.Attribute("name")
                let values = from enumeration in restriction.Elements(ns + "enumeration") select (string)enumeration.Attribute("value")
                select new { Name = name, Element = simpleType, Values = values })
            {
                var enumDefinition = GenerateEnumDefinition(x.Name, x.Values, packageName);

                Console.WriteLine(enumDefinition);

                File.WriteAllText(Path.Combine(packageDirectory, x.Name + ".java"), enumDefinition);

                var converterDefinition = GenerateConverterDefinition(x.Name, packageName);

                Console.WriteLine(converterDefinition);

                File.WriteAllText(Path.Combine(packageDirectory, x.Name + "Converter.java"), converterDefinition);

                var elementNamespace = GetNamespaceForElement(x.Element);

                var xsdUrl = GetXsdUrl(svcUrl, elementNamespace);

                AddCustomBinding(xsdUrl, x.Name, packageName);
            }
        }

        private static string GetNamespaceForElement(XElement xElement)
        {
            XNamespace xs = "http://www.w3.org/2001/XMLSchema";

            var parent = xElement.Parent;

            while (parent.Name != xs + "schema")
            {
                parent = parent.Parent;
            }

            return (string)parent.Attribute("targetNamespace");
        }

        
        private static string GetXsdUrl(string svcUrl, string elementNamespace)
        {
            XNamespace xsd = "http://www.w3.org/2001/XMLSchema";

            var wsdlDoc = XDocument.Load(svcUrl + "?wsdl");

            var xsdUrl = wsdlDoc.Descendants(xsd + "import")
                .Where(x => ((string)x.Attribute("namespace")) == elementNamespace)
                .Select(x => (string)x.Attribute("schemaLocation"))
                .Single();

            return xsdUrl;
        }

        private static void AddCustomBinding(string xsdUrl, string name, string packageName)
        {

            var bindingsFileName = "jaxb-bindings-" + packageName + ".xml";

            if (!File.Exists(bindingsFileName))
            {
                File.WriteAllText(bindingsFileName, @"<?xml version=""1.0"" encoding=""utf-8""?>
<bindings xmlns=""http://java.sun.com/xml/ns/jaxb"" xmlns:xs=""http://www.w3.org/2001/XMLSchema"" version=""2.1"">  
</bindings>");                
            }

            var bindingsDoc = XDocument.Load(bindingsFileName);

            XNamespace ns = "http://java.sun.com/xml/ns/jaxb";

            var bindingsElement = bindingsDoc.Descendants(ns + "bindings").SingleOrDefault(x => (string)x.Attribute("schemaLocation") == xsdUrl);

            if (bindingsElement == null)
            {
                bindingsElement = new XElement(ns + "bindings", new XAttribute("schemaLocation", xsdUrl));
                
                bindingsDoc.Root.Add(bindingsElement);
            }

            var existingBindingElement = bindingsElement.Elements(ns + "bindings").SingleOrDefault(x => (string)x.Attribute("node") == string.Format("//xs:simpleType[@name='{0}']", name));

            if (existingBindingElement != null)
            {
                existingBindingElement.Remove();
            }

            var enumBindingElement =
                new XElement(ns + "bindings",
                    new XAttribute("node", string.Format("//xs:simpleType[@name='{0}']", name)),
                    new XElement(ns + "javaType",
                        new XAttribute("name", string.Format("java.util.Collection<{0}>", name)),
                        new XAttribute("parseMethod", string.Format("com.microsoft.bingads.{1}.{0}Converter.convertToList", name, packageName)),
                        new XAttribute("printMethod", string.Format("com.microsoft.bingads.{1}.{0}Converter.convertToString", name, packageName)))
                    );

            bindingsElement.Add(enumBindingElement);

            bindingsDoc.Save(bindingsFileName);
        }

        static string GenerateEnumDefinition(string name, IEnumerable<string> values, string packageName)
        {
            return string.Format(EnumTemplate, name, GenerateEnumValues(values), packageName);
        }

        static string GenerateConverterDefinition(string name, string packageName)
        {
            return string.Format(ConverterTemplate, name, packageName);
        }

        private static string GenerateEnumValues(IEnumerable<string> values)
        {
            var lines = from v in values
                        select string.Format(@"    {0}(""{1}""),", ConvertToUpperUnderscore(v), v);

            var resultString = string.Join("\r\n", lines);

            resultString = resultString.Remove(resultString.Length - 1) + ";";

            return resultString;
        }

        private static string ConvertToUpperUnderscore(string input)
        {
            var sb = new StringBuilder();

            for (int i = 0; i < input.Length; i++)
            {
                var c = input[i];

                if (char.IsUpper(c))
                {
                    if (i > 0)
                    {
                        sb.Append('_');
                    }

                    sb.Append(c);
                }
                else
                {
                    sb.Append(char.ToUpper(c));
                }
            }

            return sb.ToString();

        }

        private const string EnumTemplate = @"package com.microsoft.bingads.{2};

/**
 * Enum class for {0}.
 */
public enum {0} {{

{1}
        
    private final String value;

    {0}(String v) {{
        value = v;
    }}

    public String value() {{
        return value;
    }}

    public static {0} fromValue(String v) {{
        for ({0} c : {0}.values()) {{
            if (c.value.equals(v)) {{
                return c;
            }}
        }}
        throw new IllegalArgumentException(v);
    }}
}}";

        private const string ConverterTemplate = @"package com.microsoft.bingads.{1};

import java.util.ArrayList;
import java.util.Collection;

/**
 * Reserved for internal use.
 */
public class {0}Converter {{

    public static Collection<{0}> convertToList(String enums) {{
        String[] values = enums.split("" "");

        Collection<{0}> result = new ArrayList<{0}>();

        for (String value : values) {{
            result.add({0}.fromValue(value));
        }}

        return result;
    }}

    public static String convertToString(Collection<{0}> enums) {{
        String result = """";

        for ({0} entity : enums) {{
            result += (entity.value() + "" "");
        }}

        result = result.substring(0, result.length() - 1);

        return result;
    }}
}}";
    }
}
