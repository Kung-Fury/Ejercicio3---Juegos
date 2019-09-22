
public class Carta extends Object {
	private String nombre;
	private String palo;
	private int valor;
	
	// CONSTRUCTOR
	public Carta(String nombre, String palo, int valor) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.valor = valor;
		}
	
	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	// MODIFICACIÓN toString();
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombre).append(" de ").append(palo);
        return sb.toString();
    }
}
