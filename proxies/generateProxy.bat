set pkgpath="com\microsoft\bingads\%1"
set "pkgpath=%pkgpath:.=\%"
echo pkgpath=%pkgpath%
rd /s /q "%pkgpath%"
call ..\tools\WsdlEnumGenerator\bin\Debug\WsdlEnumGenerator %1 %2

if exist jaxb-bindings-%1.xml (
    "%JAVA_HOME%\bin\wsimport" -encoding UTF-8 -disableXmlSecurity -Xnocompile -target 2.1 -B-enableIntrospection -p com.microsoft.bingads.%1 -b jaxb-bindings-%1.xml -b jaxb-bindings-all.xml -b jaxws-bindings-%1.xml %2?wsdl
) else (
    "%JAVA_HOME%\bin\wsimport" -encoding UTF-8 -disableXmlSecurity -Xnocompile -target 2.1 -B-enableIntrospection -p com.microsoft.bingads.%1 -b jaxb-bindings-all.xml -b jaxws-bindings-%1.xml %2?wsdl
)
pause
