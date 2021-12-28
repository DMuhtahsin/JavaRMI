import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class Client {  
   public static void main(String[] args) {  
      try {  
         // Getting the registry
         String host="192.168.1.2:1099"; 
         Hello remobject = (Hello)Naming.lookup("rmi://"+host+"/Hello");
         System.out.println("Client terhubung dengan Server =)))");
         System.out.println();
         System.out.println("----------------------");
         
         Scanner input = new Scanner(System.in);
         System.out.print("Panjang : " );
         int pj = input.nextInt();
         System.out.print("Lebar : ");
         int lbr = input.nextInt();
         System.out.print("Tinggi : ");
         int tg = input.nextInt();

         System.out.println("-------------------------");
         System.out.println();
         System.out.println("Hasil : " + remobject.dian(pj,lbr,tg));
         
      } catch (RemoteException re) {
        re.printStackTrace();
      } 
      catch (NotBoundException nbe) {
         nbe.printStackTrace();
      }
      catch(MalformedURLException mfe) {
         mfe.printStackTrace();
      }
   } 
}
