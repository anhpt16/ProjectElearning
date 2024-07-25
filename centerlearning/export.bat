mvn -pl . clean install & ^
mvn -pl centerlearning-sdk clean install & ^
mvn -pl centerlearning-admin-plugin clean install -Pexport,\!test & ^
mvn -pl centerlearning-web-plugin clean install -Pexport,\!test & ^
mvn -pl centerlearning-theme clean install -Pexport,\!test & ^
ezy.bat package & ^
ezy.bat export
