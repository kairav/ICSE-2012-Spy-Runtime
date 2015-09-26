export JARS=spy-monitoring.jar:storage-service.jar

java -Xmx2g -cp $JARS storageServer.StorageServerService
