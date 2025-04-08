package clases;
/**
 * @author Pablo vavregewrg
 * @version 2.0
 */
public class Rectangulo {
	private int id;
	private String nombre;
	private double ladoA;
	private double ladoB;
	private String color;
	
	public Rectangulo() {
		super();
	}

	public Rectangulo(int id, String nombre, double ladoA, double ladoB, String color) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.color = color;
	}

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

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rectangulo [id=" + id + ", nombre=" + nombre + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color="
				+ color + "]";
	}
	
	/**
	 * Metodo que sirve para calcular areas de rectangulos
	 * @param rectangulito1 hay que pasar un rectangulo con sus medidads
	 * @return el area de mis rectangulitos
	 */
	public static double calcularAreaRectangulo(Rectangulo rectangulito1) {
		// Area rectangulo l * l
		double ladoA = rectangulito1.getLadoA();
		double ladoB = rectangulito1.getLadoB();
		double areaRectangulo = ladoA*ladoB;
		return areaRectangulo;
	}
}
