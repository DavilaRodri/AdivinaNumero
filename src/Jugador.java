import java.util.Scanner;

/**
 * Clase que inicia la aplicación y gestiona el Juego
 * 
 * @version 1.0
 * @author Rodrigo Dávila
 * 
 */
public class Jugador 
{
	int fallos = 0;
	int puntos = 0;
	String nombre = "";

	public Jugador()
	{
		
	}
	
	public int getPuntos()
	{
		return puntos;
	}

	public String toString() 
	{
		return "Nombre: " +nombre+ "Fallos: " +fallos+ "Puntos: " +puntos;
	}
	
	

}