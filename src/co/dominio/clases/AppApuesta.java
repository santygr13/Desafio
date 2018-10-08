package co.dominio.clases;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppApuesta {	

	public static void main(String[] args) {
		boolean ejecutar= true;
		while(ejecutar) {
			int opcion = JOptionPane.showOptionDialog(null,
					"Bienvenido, Que deseas realizar?", null, 0, 1, null,
					Arrays.asList("Jugar", "Instrucciones").toArray(), null);
			switch(opcion) {
			
			case 0:
				int numeroJugadores=Integer.parseInt(pedirInformacion("Ingrese la cantidad de jugadores"));
				
				for(int i=0; i<numeroJugadores; ++i) {
					
					String nombreJugador=pedirInformacion("Ingrese el nombre del jugador");
					double pote= Double.parseDouble(pedirInformacion("Ingrese la cantidad de dinero a apostar"));
					
				
				}
				
				break;
			case 1:
				break;
				
				
			
			}
			
			
			
			
			
			
		
			
			
		}
				
	}
	public static String pedirInformacion(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}
	public static void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}