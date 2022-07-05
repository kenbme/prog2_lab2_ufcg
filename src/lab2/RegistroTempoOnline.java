package lab2;

/**
 * Registro do tempo online que um aluno dedica a uma disciplina remota, todo
 * registro precisa do nome da disciplina e o tempo online esperado para a
 * disciplina.
 * 
 * @author Kenned Barbosa
 *
 */
public class RegistroTempoOnline {
	private String nomeDisciplina;
	private int tempoOnlineEsperado;
	private int tempoOnline;

	public RegistroTempoOnline(String nomeDisciplina) {
		this(nomeDisciplina, 120);
	}

	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
		tempoOnline = 0;
	}

	public void adicionaTempoOnline(int tempo) {
		tempoOnline += tempo;
	}

	public boolean atingiuMetaTempoOnline() {
		return tempoOnline >= tempoOnlineEsperado;
	}

	public String toString() {
		return nomeDisciplina + " " + tempoOnline + "/" + tempoOnlineEsperado;
	}
}
