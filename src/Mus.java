import java.util.ArrayList;

public class Mus {
	Espanyola baraja;
	ArrayList<Jugador> jugador;

	public Mus(Espanyola baraja, ArrayList<Jugador> jugador) {
		super();
		this.baraja = baraja;
		this.jugador = jugador;
	}

	void addJugador(Jugador j) {
		jugador.add(j);
	}
}
