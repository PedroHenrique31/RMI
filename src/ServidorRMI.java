import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *      Classe ServidorRMI fica escutando e esperando uma requisição do clientes
 */
public class ServidorRMI {
	public static void main(String[] args) {
		
		try {
			System.out.println("Registrando o serviço");
			Calculadora c = new CalculadoraImpl();
			LocateRegistry.createRegistry(1099);// fica escutando na porta 1099
			Naming.rebind(CalculadoraImpl.getURI(), c);// nome do recurso com URI
			System.out.println("Aguardando clientes!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
