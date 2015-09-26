export LIB_HOME=libraries
export ASPECTWERKZ_HOME=$LIB_HOME/aspectwerkz-2.0
export JARS=spy-monitoring.jar:storage-service.jar

export JAVA_HOME=/usr/lib/jvm/java-8-oracle/

$ASPECTWERKZ_HOME/bin/aspectwerkz -Daspectwerkz.definition.file=config/server.xml -Xmx2g -cp $LIB_HOME/*:$JARS storageServer.faultInjection.InjectionManager
