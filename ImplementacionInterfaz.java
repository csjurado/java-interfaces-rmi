import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplementacionInterfaz extends UnicastRemoteObject implements interfaz {
    public ImplementacionInterfaz() throws RemoteException {
        super();
    }

    // Implementar meotodos indicados enla interfaz
    public String mensaje() throws RemoteException {
        return "Hola amiguitos soy el servidor ";
    }

    public double suma(double a, double b) throws RemoteException {
        return a + b;
    }

    public double resta(double a, double b) throws RemoteException {
        return a - b;
    }

    public double multplicacion(double a, double b) throws RemoteException {
        return a * b;
    }

    public double division(double a, double b) throws RemoteException {
        return a / b;
    }
}
