package ClassesTabelas;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Viagem {
	private int id_viagem, desconto, possuiHospedagem;
	private String observacoes;
	private LocalDateTime dataEntrada, dataSaida;
	private double preco, precoDiaria,precoTotal;
	private Destino destino;
	private Usuario usuario;
	private Hospedagem hospedagem;
	
	public int getPossuiHospedagem() {
		return possuiHospedagem;
	}
	public void setPossuiHospedagem(int possuiHospedagem) {
		this.possuiHospedagem = possuiHospedagem;
	}
	
	public Hospedagem getHospedagem() {
		return hospedagem;
	}
	public void setHospedagem(Hospedagem hospedagem) {
		this.hospedagem = hospedagem;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPrecoDiaria() {
		return precoDiaria;
	}
	public void setPrecoDiaria(double precoDiaria) {
		this.precoDiaria = precoDiaria;
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

	
public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
public double calculaPrecoTotal() {
		
		double novoDesconto =(double) this.desconto/100;
		
		if(possuiHospedagem == 1) {
			
			int qtDias = (int) this.dataEntrada.until(this.dataSaida, ChronoUnit.DAYS);
			System.out.println( "dias " + qtDias);
			double precoHospedagem = qtDias * this.precoDiaria;
			System.out.println( "preço " + precoHospedagem);
			
		if(this.desconto == 0) {
			System.out.println( "esse preço " + this.preco);
			return precoHospedagem + this.preco;
		}else {
			double valorDesconto = (precoHospedagem + this.preco) * novoDesconto;
			System.out.println( "desconto " + valorDesconto);
			return  precoHospedagem + this.preco - valorDesconto ;
		}
		
		}else {
			if(this.desconto == 0) {
				return this.preco;
			}else {
				double valorDesconto = this.preco * novoDesconto;
				return  this.preco - valorDesconto ;
			}		
		}
	}

public double subTotal() {
	double novoDesconto =(double) this.desconto/100;
	return preco - (novoDesconto * preco);
}

	
	@Override
	public String toString() {
		return "id_viagem: " + id_viagem + ", desconto: " + (desconto == 0 ? "Não possui desconto" : desconto +"%")   + ", observacoes: " + observacoes
				+  ",\n nome do usuário: " + usuario.getNome() 
				+ ",  saindo de: " + usuario.getEstado() + ", para " + destino.getCidade() + ", data ida: " + usuario.formatarData(dataEntrada) 
				+ ",\n data volta: " + usuario.formatarData(dataSaida) + ", sub total: " + NumberFormat.getCurrencyInstance().format(subTotal())
				+ ", total: " + NumberFormat.getCurrencyInstance().format(precoTotal);
	}
	
	
	
}
