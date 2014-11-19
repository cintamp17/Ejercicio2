import java.util.Scanner; 
import java.lang.Math; 
public class Prog1_0 { 
 
public static void main(String[] args) { 
	// TODO Auto-generated method stub
	Scanner leerradio = new Scanner(System.in); 
	int radio; 
	double area;
	System.out.println("Introduce el radio de la esfera"); 
	radio=leerradio.nextInt(); 
	area = (Math.PI) * (Math.pow(radio, 2)); 
	 System.out.println("El área de la esfera cuyo radio "+radio+" es " + area);
	System.out.println("Finalizado Version 2");
 } 
} 