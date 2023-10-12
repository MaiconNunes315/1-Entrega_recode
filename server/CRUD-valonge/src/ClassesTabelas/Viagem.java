package ClassesTabelas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Viagem {
	private int id_viagem, desconto;
	private String observacoes;
	private LocalDateTime dataEntrada, dataSaida;
	private double preco;
	private Destino destino;
	private Usuario usuario;
	private Hospedagem hospedagem;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Hospedagem getHospedagem() {
		return hospedagem;
	}
	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}
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
	public LocalDateTime getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDateTime dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public LocalDateTime getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDateTime dataSaida) {
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

	
public double calculaPrecoTotal() {
		
		int qtDias = (int) this.dataEntrada.until(this.dataSaida, ChronoUnit.DAYS);
		double precoHospedagem = qtDias * this.hospedagem.getPrecoDiaria();
		
		double novoDesconto =(double) this.desconto/100;
		
		if(this.hospedagem.getPrecoDiaria() != 0) {
		if(novoDesconto == 0) {
			return precoHospedagem + this.preco;
		}else {
			double valorDesconto = (precoHospedagem + this.preco) * novoDesconto;
			return  precoHospedagem - valorDesconto ;
		}
		}else {
			if(novoDesconto == 0) {
				return this.preco;
			}else {
				double valorDesconto = this.preco * novoDesconto;
				return  this.preco - valorDesconto ;
			}		
		}
	}

	
	@Override
	public String toString() {
		return "id_viagem: " + id_viagem + ", desconto: " + (desconto == 0 ? "Não possui desconto" : desconto +"%")   + ", observacoes: " + observacoes
				+  ",\n nome do usuário: " + usuario.getNome() 
				+ ",  saindo de: " + usuario.getEstado() + ", para " + destino.getCidade() + ", data ida: " + usuario.formatarData(dataEntrada) 
				+ ",\n data volta: " + usuario.formatarData(dataSaida);
	}
	
	
	
}
