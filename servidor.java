import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class servidor {
    public static void main(String[] args) {
        try {
            // Crear una instancia de la implementacion de la interfaz
            interfaz objetoRemoto = new ImplementacionInterfaz();

            // Crear y obtener registro RMI en el puerto específico
            Registry registro = LocateRegistry.createRegistry(5000);

            // Vincular la implementación remota al registro con un nombre específico
            registro.rebind("ClienteRemot xD", objetoRemoto);

            System.out.println("Servidor remoto iniciado.........");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
