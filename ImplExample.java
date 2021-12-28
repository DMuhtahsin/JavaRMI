import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class ImplExample extends UnicastRemoteObject implements Hello {  
   
  
   public ImplExample() throws RemoteException{super();} 
   
   public int dian(int pj, int lbr, int tg) throws RemoteException {  
     int volume;
     volume = pj*lbr*tg;
     return volume;
   } 
   
} 