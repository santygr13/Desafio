package co.dominio.clases;

import java.util.ArrayList;



public class Apuesta {
	
	private double poteApuesta;
	private ArrayList<Jugador> jugadores;
	
	
	
	

	

	
	public void agregarJugador1(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	
	public Double getPoteApuesta() {
		return poteApuesta;
	}
	public void setPoteApuesta(Double poteApuesta) {
		this.poteApuesta = poteApuesta;
	}	
	
	
}
