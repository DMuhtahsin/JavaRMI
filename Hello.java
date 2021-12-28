import java.rmi.*;


// Creating Remote interface for our application 
public interface Hello extends Remote {  
   
   public int dian(int pj, int lbr, int tg) throws RemoteException;    
} 