package co.dominio.clases;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppApuesta {	

	public static void main(String[] args) {
		boolean ejecutar= true;
		while(ejecutar) {
			int opcion = JOptionPane.showOptionDialog(null, "Guayabita", null, 0, 1, null, Arrays.asList("Jugar" , "Ver instrucciones").toArray(), null);
			
			
		}
		
		
		
		
				
	}
	public static String pedirInformacion(String mensaje) {
		return JOptionPane.showInputDialog(mensaje);
	}
	public static void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}