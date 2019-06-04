
public abstract class Aluno {
	private String nome;
	private String matricula;
	private int faltas;
	private double notaPrimeira;
	private double notaSegunda;
	private Endereco endereco;
	
	public Aluno (String nome, int faltas, double n1, double n2) {
		this.nome = nome;
		this.faltas = faltas;
		this.notaPrimeira = n1;
		this.notaSegunda = n2;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	
	public int getFaltas() {
		return faltas;
	}
	
	public void setNotaPrimeira(double n1) {
		this.notaPrimeira = n1;
	}
	
	public double getNotaPrimeira() {
		return notaPrimeira;
	}
	
	public void setNotaSegunda(double n2) {
		this.notaSegunda = n2;
	}
	
	public double getNotaSegunda() {
		return notaSegunda;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
