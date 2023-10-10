package ClassesTabelas;

public class Hospedagem {
	private int id;
	private double precoDiaria;
	private String endereco, nomeLocal;
	private Viagem viagem;
	
	public double getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
