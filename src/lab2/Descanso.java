package lab2;

/**
 * Representação da rotina de descanso de um aluno.
 * 
 * @author Kenned Barbosa
 *
 */
public class Descanso {
	private int horasDescanso;
	private int numeroSemanas;

	public Descanso() {
		horasDescanso = 0;
		numeroSemanas = 0;
	}

	public void defineHorasDescanso(int valor) {
		horasDescanso = valor;
	}

	public void defineNumeroSemanas(int valor) {
		numeroSemanas = valor;
	}

	/*
	 * Retorna "descansado" caso o aluno descanse em média 26h por semana, se não,
	 * retorna "cansado".
	 * 
	 * @return o status do descanso do aluno.
	 */
	public String getStatusGeral() {
		String statusGeral;
		if (numeroSemanas == 0)
			statusGeral = "cansado";
		else if (horasDescanso / numeroSemanas >= 26)
			statusGeral = "descansado";
		else
			statusGeral = "cansado";
		return statusGeral;
	}
}
