import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "alumno";
		
		Scanner teclado = new Scanner(System.in);
		int cont = 3;
		String contrase�a = "";
		
		do{
			
			System.out.println("Entra la contrase�a("+cont+")intentos");
			contrase�a = teclado.next();
			cont--;
	
			
		}while((cont > 0)&&(!contrase�a.equals(password)));
		
		if(contrase�a.equals(password)) {
		JOptionPane.showMessageDialog(null, "Enhorabuena! Has acertado la contrase�a.");
		}else {
			JOptionPane.showMessageDialog(null, "L�stima, no la has acertado :(");
		}
	}

}
