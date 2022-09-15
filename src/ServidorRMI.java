import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
	public static void main(String[] args) {
		
		try {
			System.out.println("Registrando o servi�o");
			Calculadora c = new CalculcadoraImpl();
			LocateRegistry.createRegistry(1099);
			Naming.rebind(CalculcadoraImpl.getURI(), c);
			System.out.println("Aguardando clientes!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
