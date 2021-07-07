import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//He pasado a hacerlo con el Scanner a no ser que el enunciado ponga claramente que hagamos uso de un pop up, ya me ahorra parsear.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entra un número");
		int numero = teclado.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número no es par");
		}
		
	}

}
