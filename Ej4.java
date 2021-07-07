import javax.swing.JOptionPane;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double pi = 3.14;
		String inputRadio = JOptionPane.showInputDialog("Introduce el radio del circulo");
		
		double radio = Double.parseDouble(inputRadio);
		
		double area = pi * Math.pow(radio, 2);
		
		System.out.println(area);
	}

}
