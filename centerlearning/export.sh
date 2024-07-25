set -e
mvn -pl . clean install
mvn -pl centerlearning-sdk clean install
mvn -pl centerlearning-admin-plugin clean install -Pexport,\!test
mvn -pl centerlearning-web-plugin clean install -Pexport,\!test
mvn -pl centerlearning-theme clean install -Pexport,\!test
ezy.sh package
ezy.sh export
