package net.gamasoft;

/**
 * @author Cesar
 *
 */
public class Polimorfismo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Figura objCuadrado;
		Figura objCirculo;
		
		objCuadrado = new Cuadrado();
		objCuadrado.area();
		objCuadrado.perimetro();
		
		objCirculo = new Circulo();
		objCirculo.area();
		objCirculo.perimetro();
	}
}