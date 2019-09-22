import java.util.ArrayList;

public abstract class Baraja {
	protected ArrayList<Carta> cartas;

	public Baraja(ArrayList<Carta> cartas) {
		super();
		this.cartas = cartas;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public abstract void barajar();
	public abstract Carta repartir();
	public abstract void reiniciar();
}
