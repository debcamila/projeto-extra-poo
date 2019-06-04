
public interface IRepAluno {
	void inserir (Aluno aluno);
	
	void remover (String matricula);
	
	void atualizar (Aluno matricula);
	
	Aluno consultar (String matricula);
}
