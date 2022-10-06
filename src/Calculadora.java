import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *      Esta interface herda da classe Remote e possui apenas um m�todo
 * para realizar a adi��o de 2 n�meros, ser�o implementada remotamente.
 *
 * Foi implementada na forma de interface porque precisamos herdar m�todos de 2 classes em 
 * java e n�o � poss�vel heran�a m�ltipla em java sem o uso de interfaces.
 */
public interface Calculadora extends Remote {
	public int adicao(int a,int b) throws RemoteException;
}
