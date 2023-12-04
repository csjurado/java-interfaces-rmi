import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class cliente {

    public static void main(String[] agrs) throws NotBoundException {
        try {
            Registry registro = LocateRegistry.getRegistry("localhost", 5000);

            // implementacionde la interfaz remota
            double a = 0, b = 0;
            interfaz objetoremoto = (interfaz) registro.lookup("ClienteRemot xD");

            String mensaje = objetoremoto.mensaje();
            System.out.println(mensaje);

            System.out.println("Hola bienvenido a mi calculadora ");

            // Scanner para leer los valores del usuario
            Scanner sc = new Scanner(System.in);

            // Solicitamos el primer valor
            System.out.println("Ingresa el primer numero : ");
            a = sc.nextDouble();

            // Solicitamos el segundo valor
            System.out.println("Ingresa el segundo numero : ");
            b = sc.nextDouble();

            double respuesta = objetoremoto.suma(a, b);
            System.out.println("La respuesta  de la suma es " + respuesta);
            System.out.println("La respuesta  de la resta es " + objetoremoto.resta(a, b));
            System.out.println("La respuesta  de la multiplicacion  es " + objetoremoto.multplicacion(a, b));
            System.out.println("La respuesta  de la suma es " + objetoremoto.division(a, b));

        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
