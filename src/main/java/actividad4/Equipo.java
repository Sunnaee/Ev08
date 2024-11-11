package actividad4;

import java.util.ArrayList;

public class Equipo {
	private Jugador capitan;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

	public Equipo(Jugador capitan, ArrayList<Jugador> jugadores) {
		this.capitan = capitan;
		this.jugadores = jugadores;
	}

	public void anadirJugador(Jugador jugador) {
		throw new UnsupportedOperationException();
	}

	public void eliminarJugador(String nombre) {
		throw new UnsupportedOperationException();
	}

	public void modificarRol(String nombre, String rol) {
		throw new UnsupportedOperationException();
	}

	public void asignarCapitan(Jugador jugador) {
		throw new UnsupportedOperationException();
	}

	public void verJugadores() {
		throw new UnsupportedOperationException();
	}
}