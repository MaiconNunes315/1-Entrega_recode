package ClassesTabelas;

import java.util.Date;

public class Viagem {
	private int id_viagem, desconto;
	private String observacoes;
	private Date dataEntrada, dataSaida;
	private Destino destino;
	private Usuario usuario;
	
	
	public int getId_viagem() {
		return id_viagem;
	}
	public void setId_viagem(int id_viagem) {
		this.id_viagem = id_viagem;
	}
	public int getDesconto() {
		return desconto;
	}
	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Destino getDestino() {
		return destino;
	}
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
