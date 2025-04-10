package clases;
/**
 * @author Pabloytrjtryjrj
 * @version 1.erge0
 */
public class Circulo {
	// Atributos
	private int id;
	private String nombre;
	private double radio;
	private String color;
	
	
	
	// Constructores
	// Constructor por defecto
	public Circulo() {
	}

	// Construcotr con todos los argumentos
	public Circulo(int id, String nombre, double radio, String color) {
		this.id = id;
		this.nombre = nombre;
		this.radio = radio;
		this.color = color;
	}

	// Getteers y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circulo [id=" + id + ", nombre=" + nombre + ", radio=" + radio + ", color=" + color + "]";
	}
	
	/**
	 * Metodo para calcular area de circulos
	 * @param circulo1 tiene que ser un circulo
	 * @return
	 */
	public static double calcularAreaCirculo(Circulo circulo1) {
		// Calcular area circulo pi * r * r
		double radio = circulo1.getRadio();
		double areaCirculo = 3.14159265 * radio * radio;
		return areaCirculo;
	}
	
	
	
}
