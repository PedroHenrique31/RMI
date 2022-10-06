import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *      Esta interface herda da classe Remote e possui apenas um método
 * para realizar a adição de 2 números, serão implementada remotamente.
 *
 * Foi implementada na forma de interface porque precisamos herdar métodos de 2 classes em 
 * java e não é possível herança múltipla em java sem o uso de interfaces.
 */
public interface Calculadora extends Remote {
	public int adicao(int a,int b) throws RemoteException;
}
