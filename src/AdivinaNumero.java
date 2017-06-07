import java.util.Random;
import java.util.Scanner;


/**
 * Clase que inicia la aplicación y gestiona el Juego
 * 
 * @version 1.0
 * @author Rodrigo Dávila
 * 
 */
public class AdivinaNumero 
{
	private static Scanner teclado;
	
	public static void juego()
	{
		Random numeroRandom = new Random();
		int num = numeroRandom.nextInt(50);
		teclado = new Scanner(System.in);
		int numero = (int) num;
		int intentos = 0;
		int numeroEscogido = 0;
		int puntos = 100;
		int error = 20;
		int puntuacion = 0;
		int intentosRestantes = 4;
		System.out.println("Empiezas con 100 puntos. Cada fallo resta 20");
		
		do
		{
			System.out.print("Introduce un valor entre el 0 y el 50: ");
			numeroEscogido = teclado.nextInt();
			
			
			if(numeroEscogido > numero)
			{
				System.out.println("Te has pasado");
				puntuacion = puntos - error;
				System.out.println(puntuacion);
				System.out.println("Tienes: " +intentosRestantes+ " intenos restantes");
				puntuacion --;
			}
			else if (numeroEscogido < numero)
			{
				System.out.println("Te has quedado corto");
				puntuacion = puntos - error;
				System.out.println(puntuacion);
				System.out.println("Tienes: " +intentosRestantes+ " intenos restantes");
			}
			
			intentosRestantes --;
			intentos++;
			//puntuacion --;
			
			if(intentosRestantes == -1)
			{
				System.out.println("Has perdido");
				System.out.println("El número era el: " + numero);
				break;
			}
		}
		while(numeroEscogido != numero);
		
		if(numeroEscogido == numero && intentos == 5)
			{
				System.out.println("¡Correcto! El número es: " + numero);
		        System.out.println("Has necesitado " + intentos + " intentos");
		        System.out.println(puntuacion);
			}
	}

}
