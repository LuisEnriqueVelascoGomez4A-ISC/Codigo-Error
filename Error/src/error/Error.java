package error;

import java.util.Scanner;

/**
 *
 * @author Luis Enrique Velasco Gómez
 */
public class Error {
    
    public static void main(String[] args) {
    double ValorReal, valorAbsoluto;
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresar el valor real");
    ValorReal = sc.nextDouble();
    System.out.print("Ingresar el valor aproximado");
    valorAbsoluto =sc.nextDouble();
    Errores Er = new Errores(ValorReal, valorAbsoluto);
    System.out.println("\nEl Error Absoluto es: " + Er.errorAbsoluto());
        System.out.println("El Error Relativo es: " + Er.errorRelativo());
        System.out.println("El Error Relativ Porcentual es: " + Er.errorRePorcentual());
    }
    
}
