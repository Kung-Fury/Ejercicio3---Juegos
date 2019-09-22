import java.util.ArrayList;

public class Program {
	public static void main(String args[]) {
		
		// VARIABLES
		
		ArrayList<Jugador> jugador = new ArrayList<Jugador>();
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		
		Carta card1, card2, card3;
		Jugador jug1, jug2;
		
		jug2 = new Jugador();
		jug2.setNombre("Jorge");
		
		Francesa baraja_francesa;
		Espanyola baraja_espanyola;
		baraja_francesa = new Francesa(cartas);
		baraja_espanyola = new Espanyola(cartas);
		
		Mus mus;
		Poker poker;
		mus = new Mus(baraja_espanyola, jugador);
		poker = new Poker(baraja_francesa, jugador);
		
		card1 = new Carta("Ocho", "diamantes", 8);
		card2 = new Carta("Seis", "trébol", 6);
		card3 = new Carta("Cuatro", "pica", 4);
		jug1 = new Jugador();
		
		jug1.darCarta(card1);
		System.out.println("El jugador " + jug1.getNombre() + " recibe " + card1.toString() + ".");
		jug1.darCarta(card2);
		System.out.println("El jugador " + jug1.getNombre() + " recibe " + card2.toString() + ".");
		System.out.println("El jugador " + jug1.getNombre() + " retira la carta " + jug1.retirarCarta(0) + ".");
		jug1.darCarta(card3);
		System.out.println("El jugador " + jug1.getNombre() + " recibe " + card3.toString() + ".");
		System.out.println("Las cartas que tiene " + jug1.getNombre() + " son:");
		System.out.println(jug1.juego());
	
	// ---------------------------------------------------------------------------------------------------
		
		// VARIABLES Y SALIDA EN PANTALLA DEL EJERCICIO 2
		System.out.println("-----------------------------------------------------");
		System.out.println("--- CARTAS BARAJA FRANCESA ---");
		for (int i = 0; i < baraja_francesa.cartas.size(); i++)
			System.out.println(baraja_francesa.cartas.get(i));
		System.out.println("--- CARTAS BARAJA FRANCESA MEZCLADAS ---");
		baraja_francesa.barajar();
		for (int i = 0; i < baraja_francesa.cartas.size(); i++)
			System.out.println(baraja_francesa.cartas.get(i));
		System.out.println("--- SE REPARTE LA PRIMERA CARTA DE LA MEZCLA ANTERIOR ---");
			System.out.println(baraja_francesa.repartir());
		System.out.println("--- SE MUESTRA LA BARAJA SIN LA CARTA REPARTIDA ---");
		for (int i = 0; i < baraja_francesa.cartas.size(); i++)
			System.out.println(baraja_francesa.cartas.get(i));
		System.out.println("--- SE VUELVE A COMPLETAR Y ORDENAR LA BARAJA FRANCESA ---");
		baraja_francesa.reiniciar();
		for (int i = 0; i < baraja_francesa.cartas.size(); i++)
			System.out.println(baraja_francesa.cartas.get(i));
		
		System.out.println("-----------------------------------------------------");
		System.out.println("--- CARTAS BARAJA ESPAÑOLA ---");
		for (int i = 0; i < baraja_espanyola.cartas.size(); i++)
			System.out.println(baraja_espanyola.cartas.get(i));
		System.out.println("--- CARTAS BARAJA ESPAÑOLA MEZCLADAS ---");
		baraja_espanyola.barajar();
		for (int i = 0; i < baraja_espanyola.cartas.size(); i++)
			System.out.println(baraja_espanyola.cartas.get(i));
		System.out.println("--- SE REPARTE LA PRIMERA CARTA DE LA MEZCLA ANTERIOR ---");
			System.out.println(baraja_espanyola.repartir());
		System.out.println("--- SE MUESTRA LA BARAJA SIN LA CARTA REPARTIDA ---");
		for (int i = 0; i < baraja_espanyola.cartas.size(); i++)
			System.out.println(baraja_espanyola.cartas.get(i));
		System.out.println("--- SE VUELVE A COMPLETAR Y ORDENAR LA BARAJA ESPAÑOLA ---");
		baraja_espanyola.reiniciar();
		for (int i = 0; i < baraja_espanyola.cartas.size(); i++)
			System.out.println(baraja_espanyola.cartas.get(i));
		
		
		// VARIABLES Y SALIDA EN PANTALLA DEL EJERCICIO 3
		System.out.println("-----------------------------------------------------");
		System.out.println("--- SE MUESTRAN LAS CARTAS DE LA BARAJA DEL JUEGO MUS ---");
		for (int i = 0; i < mus.baraja.cartas.size(); i++)
			System.out.println(mus.baraja.cartas.get(i));
		System.out.println("--- SE MUESTRA EL JUGADOR DE MUS ---");
		mus.addJugador(jug1); // Se usa la función implementada en la clase. Podría haberse usado también mus.jugador.add(jug1);
		System.out.println(mus.jugador.get(0).getNombre());
		System.out.println("--- SE AÑADE UN JUGADOR A LOS QUE CREA POR DEFECTO EL CONSTRUCTOR ---");
		mus.addJugador(jug2);
		for (int i = 0; i < mus.jugador.size(); i++) {
			System.out.println(mus.jugador.get(i).getNombre());
		}
		
		System.out.println("--- SE MUESTRAN LAS CARTAS DE LA BARAJA DEL JUEGO POKER ---");
		for (int i = 0; i < poker.baraja.cartas.size(); i++)
			System.out.println(poker.baraja.cartas.get(i));
		System.out.println("--- SE MUESTRAN LOS JUGADORES DE POKER ---");
		for (int i = 0; i < poker.jugador.size(); i++) {
			System.out.println(poker.jugador.get(i).getNombre());
		}
		System.out.println("--- SE VAN DOS JUGADORES DE POKER Y SE MUESTRAN LOS QUE QUEDAN ---");
		poker.jugador.remove(0);
		poker.jugador.remove(2);
		for (int i = 0; i < poker.jugador.size(); i++) {
			System.out.println(poker.jugador.get(i).getNombre());
		}
		System.out.println("--- SE INTENTA CREAR UNA NUEVA PARTIDA Y MUESTRA EL AVISO DE JUGADORES INSUFICIENTES ---");
		poker = new Poker(baraja_francesa, jugador);
		System.out.println("--- SE AÑADE UN JUGADOR A LOS QUE CREA POR DEFECTO EL CONSTRUCTOR ---");
		poker.addJugador(jug2);
		for (int i = 0; i < poker.jugador.size(); i++) {
			System.out.println(poker.jugador.get(i).getNombre());
		}
		System.out.println("-----------------------------------------------------");
	}
}
