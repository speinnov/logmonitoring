# logmonitoring
monitoring of logs with apache log4j2

without pom.xml

version de la branche origin/mac_version
 mvn deploy:deploy-file \
 -DgroupId=com.speinnov.tools.monitoring -DartifactId=logginmanager \
 -Dversion=1.4 \
 -DgeneratePom=true  \
 -Dpackaging=jar  \
 -DrepositoryId=talend-snapshots \
 -Durl=http://vps40346.lws-hosting.com:8888/nexus/content/repositories/talend_snapshots \
 -Dfile=logginmanager/target/logginmanager-1.4.jar
 
 
 With ppom.xml
 
 mvn deploy:deploy-file \
 -DgeneratePom=false \
 -DrepositoryId=talend-snapshots \
 -Durl=http://vps40346.lws-hosting.com:8888/nexus/content/repositories/talend_snapshots  \
 -DpomFile=pom.xml \
 -Dfile=target/logginmanager-1.4.jar 
