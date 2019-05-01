export oldVersion=1.1-SNAPSHOT
export newVersion=1.2-SNAPSHOT
mvn versions:set -DnewVersion=$oldVersion 
mvn clean install
mvn versions:set -DnewVersion=$newVersion 
mvn clean install

#mvn release:prepare -P auth 
#mvn release:perform -P auth 
#cd target/checkout 
#mvn clean deploy

mvn deploy:deploy-file -DgroupId=com.speinnov.tools.monitoring -DartifactId=logginmanager -Dversion=$newVersion -DgeneratePom=true -Dpackaging=jar -DrepositoryId=talend_snapshots  -Durl=http://vps40346.lws-hosting.com:8888/nexus/content/repositories/talend_snapshots -Dfile=target/logginmanager-$newVersion.jar


