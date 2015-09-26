\export LIB_HOME=libraries
export ASPECTWERKZ_HOME=$LIB_HOME/aspectwerkz-2.0
export JUNIT_HOME=$LIB_HOME/jUnit4
export JARS=spy-monitoring.jar:storage-service.jar

export JAVA_HOME=/Library/Java/Home

javac generated/it/polimi/dei/spy/wrappers/StorageServiceClientViewWrapper.java -d bin -cp libraries/spylib-2.0b.jar:storage-service.jar
