import java.util.ArrayList;

public class Poker {
	Francesa baraja;
	Jugador jug1, jug2, jug3, jug4;
	ArrayList<Jugador> jugador = new ArrayList<Jugador> ();
	
	// CONSTRUCTOR
	public Poker(Francesa baraja, ArrayList<Jugador> jugador) {		// Francesa baraja, ArrayList<Jugador> jugador
		super();
		this.baraja = baraja;

		jug1 = new Jugador();
		jug2 = new Jugador();
		jug3 = new Jugador();
		jug4 = new Jugador();
		jug2.setNombre("Alberto");
		jug3.setNombre("Laura");
		jug4.setNombre("Adrián");
		this.jugador.add(jug1);
		this.jugador.add(jug2);
		this.jugador.add(jug3);
		this.jugador.add(jug4);
		
		if (jugador.size() < 2)
			System.out.println("Jugadores insuficientes. Se requieren más de dos.");
		else baraja.reiniciar(); // Se inicia la baraja.
		
		
	}
	
	// MÉTODOS
	void addJugador(Jugador j) {
		jugador.add(j);
	}
}
