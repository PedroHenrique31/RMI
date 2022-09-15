import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {

	private static final long serialVersionUID = -6329985319833420103L;
	private static String SERVIDOR = "localhost";
	private static int PORTA = 1099;
	private static String SERVICO = "Calc";
	

	protected CalculadoraImpl() throws RemoteException {
		super();
	}

	@Override
	public int adicao(int a, int b) throws RemoteException {
		return a + b;
	}
	
	public static String getURI() {
		String uri = String.format("rmi://%s:%d/%s", SERVIDOR, PORTA, SERVICO);
		return uri;
	}
	

}
