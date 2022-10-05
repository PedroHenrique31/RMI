import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *      Classe CalculadoraImpl é a implementação de classe Calculadora e herda de UnicastRemoteObject 
 * ela é portanto o nosso objeto remoto que será chamado pelo cliente.
 */
public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

	private static final long serialVersionUID = -6329985319833420103L;
	private static String SERVIDOR = "localhost";
	private static int PORTA = 1099;
	private static String SERVICO = "Calc"; // nome do serviço
	
        
        // Construtor de CalculadoraImpl como é chamado remotamente lança uma excessão.
	protected CalculadoraImpl() throws RemoteException {
		super();
	}
        
        // implementação do método adição.
	@Override
	public int adicao(int a, int b) throws RemoteException {
		return a + b;
	}
	
	// retorna uma URI de onde chamaremos esse recurso eu suponho
	public static String getURI() {
		String uri = String.format("rmi://%s:%d/%s", SERVIDOR, PORTA, SERVICO);
		return uri;
	}
	

}
