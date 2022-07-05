package lab2;

import java.util.Arrays;

/**
 * Representação de uma disciplina, toda disciplina precisa de um nome para ser
 * instanciada.
 * 
 * @author Kenned Barbosa
 *
 */
public class Disciplina {
	private String nomeDisciplina;
	private int horasEstudo;
	private double[] notas;
	private final double MIN_VALOR_NOTA;
	private final double MAX_VALOR_NOTA;

	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		horasEstudo = 0;
		notas = new double[4];
		MIN_VALOR_NOTA = 0.0;
		MAX_VALOR_NOTA = 10.0;
	}

	public void cadastraHoras(int horas) {
		horasEstudo += horas;
	}

	/**
	 * Uma nota só é cadastrada caso idxNota seja uma posição válida no array
	 * "notas" e valorNota esteja entre a mínima e máxima nota permitida.
	 * 
	 * @param idxNota   posição no array "notas" que vai ser colocada a nota.
	 * @param valorNota valor da nota
	 */
	public void cadastraNota(int idxNota, double valorNota) {
		if ((idxNota >= 1 && idxNota <= notas.length) && (valorNota >= MIN_VALOR_NOTA && valorNota <= MAX_VALOR_NOTA))
			notas[idxNota - 1] = valorNota;
	}

	private double calculaMedia() {
		return Util.soma(notas) / notas.length;
	}

	public boolean aprovado() {
		return calculaMedia() >= 7.0;
	}

	public String toString() {
		return nomeDisciplina + " " + horasEstudo + " " + calculaMedia() + " " + Arrays.toString(notas);
	}
}
