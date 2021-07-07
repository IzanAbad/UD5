import java.util.Scanner;

public class Ej10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		
		int numeroVentas = 3;
		double array[] = new double[numeroVentas];
		
		//lo hice con un array pensando que java tendria una funcion para sumar todos los valores de un array,
		//despues de 5 minutos de busqueda intensiva no encontré nada, asi que la funcion la tuve que hacer yo :/
		
		for(int i =0;i<array.length;i++) {
			
			System.out.println("Entra el precio del producto "+(i+1));
			array[i] = teclado.nextInt();
		}
		
		double total = sumarArray(array);
		
		System.out.println(total);
		
	}
	
	public static double sumarArray(double[]array) {
		
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			sum = sum + array[i];
		}
		
		
		return sum;
	}

}
