import java.rmi.*;
import java.net.*; 
import java.io.*; 
import java.rmi.server.UnicastRemoteObject;
import java.security.AllPermission;
import java.security.Permission; 

public class Server { 
   public static void main(String args[]) { 
      try { 
         // Instantiating the implementation class 
         Hello localobj=new ImplExample();
         Naming.rebind("rmi://192.168.1.1:1099/Hello",localobj);
         System.out.println("Server siap menerima koneksi :))))");

    
      } catch (RemoteException re) { 
        re.printStackTrace();
      } 
      catch (MalformedURLException mfe) {
         mfe.printStackTrace();
      }
      

   }
    
} 
