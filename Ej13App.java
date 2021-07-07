import java.util.Scanner;

public class Ej13App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =0;
		int b = 0;
		String signo = "";
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Entra el primer número");
		a = teclado.nextInt();
		
		System.out.println("Entra el segundo número");
		b = teclado.nextInt();
		
		
		System.out.println("Entra el signo aritmético");
		signo = teclado.next();
		
		switch(signo) {
		
		case"+":
			System.out.println(a+b);
			break;
		case"-":
			System.out.println(a-b);
			break;
		case"*":
			System.out.println(a*b);
			break;
		case"/":
			System.out.println(a/b);
			break;
		case"^":
			System.out.println(Math.pow(a,b));
			break;
		case"%":
			System.out.println(a%b);
			break;
			
			default: System.out.println(signo+" No es un signo válido");
				break;
		
		
		}
		
	}

}
