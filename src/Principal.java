import java.util.Scanner;

/**
 * Clase que inicia la aplicación y gestiona el Juego
 * 
 * @version 1.0
 * @author Rodrigo Dávila
 * 
 */

public class Principal 
{	
	private Scanner teclado;
	
	public Principal()
	{
		teclado = new Scanner(System.in);
	}
	
	public void ejecutar()
	{
		
		int opcion;

		do {

			System.out.println("\n---------- ADIVINA NUMERO ----------");
			System.out.println("  	1. Ver mi usuario");
			System.out.println("  	2. Jugar");
			System.out.println("  	3. salir");
			System.out.println("------------------------------------");
			System.out.print("  	Opcion: ");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {

			case 1:
				verUsuario();
				break;

			case 2:
				Jugar();
				break;

			case 3:
				System.out.println("Has seleccionado la opcion 3");
				System.out.println("Adios!!");
				break;

			default:
				System.out.println("Opcion incorrecta, escoja alguna contenida en el menu");
			}

		} while (opcion != 3);
	}
		
		private void verUsuario()
		{
			System.out.println("Has seleccioando la opcion 1");
		}
		
		public void Jugar()
		{
			System.out.println("Has seleccioando la opcion 2");
			AdivinaNumero.juego();
		}
		
		public static void main(String args[]) 
		{
			new Principal().ejecutar();
			
		}

}
