
public class Endereco {
	private String rua;
	private String numero;
	private String cep;
	
	public Endereco(String rua, String num, String cep) {
		this.rua = rua;
		this.numero = num;
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
}
