import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
/**
 *      Classe ClienteRMI ela chama método calculadora de forma remota.
 */
public class ClienteRMI {
	
	public static void main(String[] args) {
		try {
		        /* Chama um objeto do tipo calculadora usando Naming.lookup 
		         * basicamente ela procura por esse objeto no servidor RMI.
		         */
			Calculadora c = (Calculadora) Naming.lookup(CalculadoraImpl.getURI());
			System.out.println(c.adicao(1, 3));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
