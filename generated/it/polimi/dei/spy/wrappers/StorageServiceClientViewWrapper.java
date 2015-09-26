package it.polimi.dei.spy.wrappers;

import storageServerClient.StorageServiceClientView;
import it.polimi.dei.spy.config.annotations.*;
import it.polimi.dei.spy.analysis.bm.BehaviorModelMiner.BehaviorModelTypes;

@HeurekaConfig(maxSizeOfTerms = 3, maxSizeOfTestCases = 3, additionalSizeOfInequalityDemonstrators = 3, behaviorModel = BehaviorModelTypes.BEHAVIORAL_EQUIVALENCE_MODEL, extendedObserverEquations = false)
@InstancePoolTypes({ @Pool(name = "write( byte[] ) argument 0", type = String.class, values = { "0" }), @Pool(name = "putNextEntry( java.lang.String ) argument 0", type = java.lang.String.class, values = { "ee", "ff" }) })
@SpyWrapper(wrappedClass = storageServerClient.StorageServiceClientView.class)
public class StorageServiceClientViewWrapper {

    private StorageServiceClientView wrappedElement;

    private it.polimi.dei.spy.util.serialization.SerializedInstancePool instanceLoader = it.polimi.dei.spy.util.serialization.SerializedInstancePool.load();

    @Test(wrappedMethodSignature = "public storageServerClient.StorageServiceClientView() throws java.rmi.RemoteException,java.rmi.NotBoundException,storageServer.InstanceException")
    public StorageServiceClientViewWrapper() throws java.rmi.RemoteException, java.rmi.NotBoundException, storageServer.InstanceException {
        wrappedElement = new storageServerClient.StorageServiceClientView();
    }

    @Test(wrappedMethodSignature = "public void storageServerClient.StorageServiceClientView.finish() throws java.rmi.RemoteException,java.io.IOException")
    public void finish() throws java.rmi.RemoteException, java.io.IOException {
        wrappedElement.finish();
    }

    @Test(wrappedMethodSignature = "public void storageServerClient.StorageServiceClientView.putNextEntry(java.lang.String) throws java.rmi.RemoteException,java.io.IOException")
    public void putNextEntry(@BindInstancePool("putNextEntry( java.lang.String ) argument 0") String arg0) throws java.rmi.RemoteException, java.io.IOException {
        wrappedElement.putNextEntry(arg0);
    }

    @Test(wrappedMethodSignature = "public void storageServerClient.StorageServiceClientView.unbind() throws java.rmi.RemoteException,java.rmi.NotBoundException,storageServer.InstanceException")
    public void unbind() throws java.rmi.RemoteException, java.rmi.NotBoundException, storageServer.InstanceException {
        wrappedElement.unbind();
    }

    @Test(wrappedMethodSignature = "public void storageServerClient.StorageServiceClientView.write(byte[]) throws java.rmi.RemoteException,java.io.IOException")
    public void write(@BindInstancePool("write( byte[] ) argument 0") String arg0) throws java.rmi.RemoteException, java.io.IOException {
        wrappedElement.write((byte[]) instanceLoader.loadInstance("write( byte[] ) argument 0", arg0));
    }

    @Test(wrappedMethodSignature = "public void storageServerClient.StorageServiceClientView.close() throws java.rmi.RemoteException,java.io.IOException")
    public void close() throws java.rmi.RemoteException, java.io.IOException {
        wrappedElement.close();
    }

    @Test(wrappedMethodSignature = "public java.lang.String java.lang.Object.toString()")
    public java.lang.String toString() {
        return wrappedElement.toString();
    }

    @Test(wrappedMethodSignature = "public native int java.lang.Object.hashCode()")
    public int hashCode() {
        return wrappedElement.hashCode();
    }
}
