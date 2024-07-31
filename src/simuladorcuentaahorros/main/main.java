/*
Nombre del estudiante: Julio Manuel Nieto Martinez
Grupo: 213022_8
Programa: Fundamentos de Programacion
Codigo Fuente: autoria propia
*/
package simuladorcuentaahorros.main;
import java.util.Scanner;
import static simuladorcuentaahorros.logica.logica.procesarCuentaAhorros;

public class main {

    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada por teclado
        Scanner scanner = new Scanner(System.in);
        
        // Captura del saldo de la cuenta de ahorros
        System.out.println("Ingrese el saldo de la cuenta de ahorros: ");
        int saldo = scanner.nextInt();
        
        // Captura del número de meses inactiva la cuenta
        System.out.println("Ingrese el número de meses que la cuenta ha estado inactiva: ");
        int mesesInactiva = scanner.nextInt();
        
        // Calcular y mostrar el resultado según las condiciones
        procesarCuentaAhorros(saldo, mesesInactiva);
    }
}
