
public class Turma {
	private Aluno []aluno;
	private String codigo;
	
	public Turma(String codigo, int numAlunos) {
		this.codigo = codigo;
		this.aluno = new Aluno[];
	}

	public String getCodigo() {
		return codigo;
	}

}
