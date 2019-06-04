
public class TesteFaculdade {

	public static void main(String[] args) {
		CtrlAluno ctrlAluno = new CtrlAluno ();
		CtrlTurma ctrlTurma = new CtrlTurma();
		
		try {
			crtlAluno.inserir("maria", "123", 2, 9.5, 9.5);
		}
		catch (TurmaException e){
			e.printStackTrace();
		}
	}

}
