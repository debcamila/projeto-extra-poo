
public interface IRepTurma {
	
	void inserir (Turma aluno);
	
	void remover (String matricula);
	
	void atualizar (Turma matricula);
	
	Turma consultar (String matricula);
}
