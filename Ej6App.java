import java.util.*;

public class Ej6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final int IVA = 21;
		double precioFinal;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entra el precio del producto");
		double precio = teclado.nextInt();
		
		
		
		precioFinal = precio + precio * IVA / 100;
		System.out.println("El precio final es de: "+precioFinal+"€");
	}

}
