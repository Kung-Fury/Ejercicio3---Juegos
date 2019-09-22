import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private ArrayList<Carta> cartas;
	
	// CONSTRUCTORES

	public Jugador() {
		super();
		nombre = "Alex";
		cartas = new ArrayList<Carta>();
	}

	// SETTERS Y GETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// MÉTODOS
	public void darCarta (Carta carta) { // Añade carta a las del jugador.
		cartas.add(carta);
	}
	
	public Carta retirarCarta(int indice) {  // Retira una carta de las que tiene el jugador y devuelve el valor de la carta retirada.
		Carta aux_carta;
		aux_carta = cartas.get(indice);
		cartas.remove(indice);
		return aux_carta;
	}
	
	public String juego() {  // Muestra las cartas que tiene actualmente el jugador.
		return cartas.toString();
	}
}
