package clases;

/**
 * @author Pablo
 * @version 1.0
 */
public class Main {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(1, "ciculito1", 3, "red");
		Rectangulo rectangulito1 = new Rectangulo(2, "Rectangu", 2, 3, "verde");
		
		double areaCirculo = Circulo.calcularAreaCirculo(circulo1);
		
		
		double areaRectangulo = Rectangulo.calcularAreaRectangulo(rectangulito1);
		
		imprimirResultados(areaCirculo, areaRectangulo);
		
		
		System.out.println(circulo1);

	}

	/**
	 * Imprime las figuras
	 * @param areaCirculo
	 * @param areaRectangulo
	 */
	private static void imprimirResultados(double areaCirculo, double areaRectangulo) {
		// IMPRIMIR DATOS
		System.out.println("Area circulo: "+areaCirculo);
		System.out.println("Area rectangulo: "+areaRectangulo);
	}

	

	

}
