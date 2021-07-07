import java.util.Scanner;

public class Ej11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un dia de la semana");
		String dia = teclado.next();
		
		dia = dia.toLowerCase();
		
		
		switch(dia) {
		
		case "lunes":
			System.out.println("Es dia laboral.");
			break;
		case "martes":
			System.out.println("Es dia laboral.");
			break;
		case "miercoles":
			System.out.println("Es dia laboral.");
			break;
		case "jueves":
			System.out.println("Es dia laboral.");
			break;
		case "viernes":
			System.out.println("Es dia laboral.");
			break;
		case "sabado":
			System.out.println("Si tienes suerte, no es dia laboral :) ");
			break;
		case "domingo":
			System.out.println("No es dia laboral :)");
			break;
			
			default: System.out.println(dia+" No es un dia válido");
				break;
		
		}
		
	}

}
