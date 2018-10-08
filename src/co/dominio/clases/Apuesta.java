package co.dominio.clases;

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
	
}
