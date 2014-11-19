import java.util.Scanner; 
import java.lang.Math; 
public class Prog1_0 { 
 
public static void main(String[] args) { 
	// TODO Auto-generated method stub
	Scanner leerradio = new Scanner(System.in); 
	int radio;
	double longitud;
	System.out.println("Introduce el radio de la esfera"); 
	radio=leerradio.nextInt(); 
	longitud = 2 * (Math.PI)* radio;
	System.out.println("La longitud de la circunferencia cuyo radio " + radio + " es " + longitud); 
			System.out.println("Finalizado Version 3");
 } 
} 