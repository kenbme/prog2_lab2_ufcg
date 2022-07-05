package lab2;

/**
 * Classe auxiliar com funções estáticas para evitar repetição de código.
 * 
 * @author Kenned Barbosa
 *
 */
public class Util {
	public static int soma(int[] a) {
		int sum = 0;
		for (int i : a)
			sum += i;
		return sum;
	}

	public static double soma(double[] a) {
		double sum = 0;
		for (double i : a)
			sum += i;
		return sum;
	}
}
