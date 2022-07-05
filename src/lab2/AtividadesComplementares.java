package lab2;

/**
 * Representação das atividades complementares realizadas por um aluno.
 * 
 * @author Kenned Barbosa
 *
 */
public class AtividadesComplementares {
	private int[] horasEstagios;
	private int[] mesesProjetos;
	private double horasCursos;
	private int quantEstagios;
	private int quantProjetos;

	public AtividadesComplementares() {
		horasEstagios = new int[9];
		mesesProjetos = new int[16];
		horasCursos = 0;
		quantEstagios = 0;
		quantProjetos = 0;
	}

	/**
	 * Um estágio só é adicionado caso o array "horasEstagios" não tenha sido
	 * preenchido totalmente.
	 * 
	 * @param horas as horas de um estágio realizado.
	 */
	public void adicionarEstagio(int horas) {
		if (quantEstagios >= 0 && quantEstagios < horasEstagios.length)
			horasEstagios[quantEstagios++] = horas;
	}

	/**
	 * Um projeto só é adicionado caso o array "mesesProjetos" não tenha sido
	 * preenchido totalmente.
	 * 
	 * @param meses os meses de um projeto realizado.
	 */
	public void adicionarProjeto(int meses) {
		if (quantProjetos >= 0 && quantProjetos < mesesProjetos.length)
			mesesProjetos[quantProjetos++] = meses;
	}

	public void adicionarCurso(double horas) {
		horasCursos += horas;
	}

	/**
	 * Cada 300h de estágio valem 5 créditos.
	 * 
	 * @return total de créditos obtidos dos estágios.
	 */
	private int contaCreditosEstagio() {
		return Util.soma(horasEstagios) / 300 * 5;
	}

	/**
	 * Cada 3 meses de projeto valem 2 créditos.
	 * 
	 * @return total de créditos obtidos dos projetos.
	 */
	private int contaCreditosProjetos() {
		return Util.soma(mesesProjetos) / 3 * 2;
	}

	/**
	 * Cada 30 horas de curso vale 1 crédito.
	 * 
	 * @return total de créditos obtidos dos cursos.
	 */
	private int contaCreditosCursos() {
		return (int) horasCursos / 30;
	}

	public int contaCreditos() {
		return contaCreditosEstagio() + contaCreditosProjetos() + contaCreditosCursos();
	}

	/**
	 * 
	 * @return array de Strings com estágios e suas horas, projetos e seus meses,
	 *         cursos e suas horas, as 3 linhas finais são os créditos obtidos dos
	 *         estágios, projetos e cursos, respectivamente.
	 */
	public String[] pegaAtividades() {
		String[] atividades = new String[quantEstagios + quantProjetos + 4];
		int j = 0;
		for (int i = 0; i < quantEstagios; i++)
			atividades[j++] = "Estagio" + " " + horasEstagios[i];
		for (int i = 0; i < quantProjetos; i++)
			atividades[j++] = "Projeto" + " " + mesesProjetos[i];
		atividades[j++] = "Cursos" + " " + horasCursos;
		atividades[j++] = "Creditos_Estagio" + " " + contaCreditosEstagio();
		atividades[j++] = "Creditos_Projeto" + " " + contaCreditosProjetos();
		atividades[j] = "Creditos_Cursos" + " " + contaCreditosCursos();
		return atividades;
	}
}
