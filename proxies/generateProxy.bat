call ..\tools\WsdlEnumGenerator\bin\Debug\WsdlEnumGenerator %1 %2

if exist jaxb-bindings-%1.xml (
    "C:\Program Files\Java\jdk1.8.0_20\bin\wsimport" -disableXmlSecurity -Xnocompile -target 2.1 -B-enableIntrospection -p com.microsoft.bingads.%1 -b jaxb-bindings-%1.xml -b jaxb-bindings-all.xml -b jaxws-bindings-%1.xml %2?wsdl
) else (
    "C:\Program Files\Java\jdk1.8.0_20\bin\wsimport" -disableXmlSecurity -Xnocompile -target 2.1 -B-enableIntrospection -p com.microsoft.bingads.%1 -b jaxb-bindings-all.xml -b jaxws-bindings-%1.xml %2?wsdl
)