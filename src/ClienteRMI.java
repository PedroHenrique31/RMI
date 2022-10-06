import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
/**
 *      Classe ClienteRMI ela chama método calculadora de forma remota.
 */
public class ClienteRMI {
	
	public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		int num1,num2;
		try {
		        /* Chama um objeto do tipo calculadora usando Naming.lookup 
		         * basicamente ela procura por esse objeto no servidor RMI.
		         */
			Calculadora c = (Calculadora) Naming.lookup(CalculadoraImpl.getURI());
			System.out.println("Digita aí um numero para somarmos.");
			num1=leitor.nextInt();
			System.out.println("Mais um");
			num2=leitor.nextInt();
			System.out.println("Resultado é "+c.adicao(num1, num2));
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
