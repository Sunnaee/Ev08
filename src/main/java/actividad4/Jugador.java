package actividad4;

public class Jugador {
	private String nombre;
	private String rol;
	private Equipo equipo;

	public Jugador(String nombre, String rol) {
		this.nombre = nombre;
		this.rol = rol;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Jugador{" +
				"nombre='" + nombre + '\'' +
				", rol='" + rol + '\'' +
				", equipo=" + equipo +
				'}';
	}
}