import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClienteRMI {
	
	public static void main(String[] args) {
		try {
			Calculadora c = (Calculadora) Naming.lookup(CalculcadoraImpl.getURI());
			System.out.println(c.adicao(1, 3));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
