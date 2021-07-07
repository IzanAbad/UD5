import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "alumno";
		
		Scanner teclado = new Scanner(System.in);
		int cont = 3;
		String contraseña = "";
		
		do{
			
			System.out.println("Entra la contraseña("+cont+")intentos");
			contraseña = teclado.next();
			cont--;
	
			
		}while((cont > 0)&&(!contraseña.equals(password)));
		
		if(contraseña.equals(password)) {
		JOptionPane.showMessageDialog(null, "Enhorabuena! Has acertado la contraseña.");
		}else {
			JOptionPane.showMessageDialog(null, "Lástima, no la has acertado :(");
		}
	}

}
