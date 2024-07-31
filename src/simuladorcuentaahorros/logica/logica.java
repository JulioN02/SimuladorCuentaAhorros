package simuladorcuentaahorros.logica;
public class logica { 
    // Función para procesar la cuenta de ahorros
    public static void procesarCuentaAhorros(int saldo, int mesesInactiva) {
        int cargoGobierno = 92000;
        
        if (mesesInactiva > 12 && saldo >= cargoGobierno) {
            System.out.println("El gobierno te va a cobrar $92.000");
            saldo -= cargoGobierno;
            System.out.println("Nuevo saldo de la cuenta de ahorros: " + saldo);
        } else {
            System.out.println("No hay cargos a realizar en la cuenta.");
        }
    }
}

