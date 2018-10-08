package co.dominio.clases;

import java.util.ArrayList;

public class Apuesta {
	public Jugador jugadoresApuesta;
	public Double poteApuesta;
	
	public Apuesta(Jugador jugadoresApuesta, Double poteApuesta) {
		this.jugadoresApuesta = jugadoresApuesta;
		this.poteApuesta = poteApuesta;
	}
	public Jugador getJugadoresApuesta() {
		return jugadoresApuesta;
	}
	public void setJugadoresApuesta(Jugador jugadoresApuesta) {
		this.jugadoresApuesta = jugadoresApuesta;
	}
	public Double getPoteApuesta() {
		return poteApuesta;
	}
	public void setPoteApuesta(Double poteApuesta) {
		this.poteApuesta = poteApuesta;
	}	
	public ArrayList<Jugador> agregarJugador(Jugador jugador) {
		ArrayList<Jugador> listaJugador = new ArrayList<Jugador>();
		for(int i=0; i<listaJugador.size(); ++i) {
			listaJugador.add(jugador);			
		}
		return listaJugador;
	}	
}
