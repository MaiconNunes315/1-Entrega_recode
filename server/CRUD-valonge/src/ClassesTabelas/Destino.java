package ClassesTabelas;

public class Destino {
	private int id_destino;
	private String detalhes, estado, img, regiao, pais, cidade;
	private boolean possuiPromocao;
	public int getId_destino() {
		return id_destino;
	}
	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public boolean isPossuiPromocao() {
		return possuiPromocao;
	}
	public void setPossuiPromocao(boolean possuiPromocao) {
		this.possuiPromocao = possuiPromocao;
	}
	
	
}
