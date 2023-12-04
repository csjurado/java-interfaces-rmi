import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interfaz extends Remote {

    // Metodos que el cliente puede invokar

    String mensaje() throws RemoteException;

    double suma(double a, double b) throws RemoteException;

    double resta(double a, double b) throws RemoteException;

    double multplicacion(double a, double b) throws RemoteException;

    double division(double a, double b) throws RemoteException;
}