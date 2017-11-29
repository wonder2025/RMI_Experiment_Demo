import java.rmi.*;
public interface RemoteInterface extends Remote{
    String FirstMethod() throws RemoteException;
}
