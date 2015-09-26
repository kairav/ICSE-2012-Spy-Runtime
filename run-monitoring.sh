export LIB_HOME=libraries
export ASPECTWERKZ_HOME=$LIB_HOME/aspectwerkz-2.0
export JARS=spy-monitoring.jar:storage-service.jar

export JAVA_HOME=/usr/lib/jvm/java-8-oracle/

$ASPECTWERKZ_HOME/bin/aspectwerkz -Daspectwerkz.definition.file=$1 -cp $JARS:$LIB_HOME/*:bin $2
