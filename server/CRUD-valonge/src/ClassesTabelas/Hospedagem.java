package ClassesTabelas;

public class Hospedagem {
	private int id;
	private double precoDiaria;
	private String endereco, nomeLocal;
	private Destino destino;
	
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

	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id: " + id + ", precoDiaria: " + precoDiaria + ", endereco: " + endereco + ", hospedagem: "
				+ nomeLocal + ", destino: " + ", pais: " + destino.getPais() + ", cidade: " + destino.getCidade()
				;
	}

	
	
}
