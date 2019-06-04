import java.util.TreeSet;

public class RepositorioAlunoTreeSet {
	private TreeSet<Aluno> alunos;
	
	public RepositorioAlunoTreeSet() {
		alunos = new TreeSet<>();
	}
	
	public void inserir(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void atualizar(Aluno aluno) {
		if(alunos.contains(aluno)) {
			alunos.remove(aluno);
			alunos.add(aluno);
		}
	}
	
	public Aluno consultar(String matricula) {
		for(Aluno a : alunos) {
			if(a.getMatricula().equals(matricula)) {
				return a;
			}
		}
		return null;
	}
	
	public void remover (Aluno aluno) {
		for(Aluno a : alunos) {
			if(a.getMatricula().equals(aluno.getClass())) {
				alunos.remove(a);
				return;
			}
		}
	}
}
