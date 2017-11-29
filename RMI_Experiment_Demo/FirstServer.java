//FirstServer.java
import java.rmi.*;
import java.rmi.server.*;
public class FirstServer{
    public static void main(String[] args) throws Exception{
        RemoteInterface object=new FirstImpl();
        Naming.rebind("rmi://127.0.0.1/RemoteServer",object);
		//Naming.rebind("rmi://localhost/RemoteServer",object);

        System.out.println("I am ready!");
    }
}
