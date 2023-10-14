package Principal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import ClassesTabelas.Contato;
import ClassesTabelas.Destino;
import ClassesTabelas.Hospedagem;
import ClassesTabelas.Usuario;
import ClassesTabelas.Viagem;

import Menu.SubMenu;
import TabelasDAO.ContatoDAO;
import TabelasDAO.DestinoDAO;
import TabelasDAO.HospedagemDAO;
import TabelasDAO.UsuarioDAO;
import TabelasDAO.ViagemDAO;

public class Main {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		// corrigir o sub menu
		
		
		int menuNumber = 1;
		
		while(menuNumber != 0) {
			System.out.println("----- Bem vindo ao nosso sistema de viagens 'Válonge' ----- ");
			System.out.println(" Digite 1 para inserir dados");
			System.out.println(" Digite 2 para leitura de  dados");
			System.out.println(" Digite 3 para atualizar dados");
			System.out.println(" Digite 4 para deletar dados");
			System.out.println(" Digite 5 para filtar dados através do id");
			
			menuNumber = input.nextInt();
			
			switch (menuNumber) {
			case 1: 
				SubMenu inserir = new SubMenu();
				inserir.insert();
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + menuNumber);
			}
			
			
		}
		
		

	

		//novoUsuario.buscarUsuarios(3);
	//novoUsuario.detelarUsuario(1);
	//novoUsuario.atualizarUsuario(usuario, 3, "nome");	
//	Destino destino = new Destino();
//	destino.setCidade("Rio de Janeiro");
//	destino.setDetalhes("O rio de janeiro continua lindo, o rio de janeiro continua sendo");
//	destino.setEstado("Rio de Janeiro");
//	destino.setId_destino(2);
//	destino.setImg("https://brazilexpedition.com/wp-content/uploads/2021/09/Lagoa-Azul3-625x430.jpg");
//	destino.setPais("Brasil");

//	
//	DestinoDAO novoDestino = new DestinoDAO();
//	novoDestino.createDestino(destino);
	//novoDestino.searchDestino(1);
	//novoDestino.updateDestino(destino, 1, "estado");
	//novoDestino.deteteDestino(1);
	
//	Contato contato = new Contato();
//	contato.setId(1);
//	contato.setData(LocalDateTime.now());
//	contato.setEmail("desconhecido2@hotmail.com");
//	contato.setMensagem("Gostaria de 28/11/2023?");
//	contato.setNome("Diguinho");
//	contato.setTelefone("11999999999");
//	
	//ContatoDAO contatodao = new ContatoDAO();
	//contatodao.createContato(contato);
	//contatodao.readContato();
	//contatodao.searchContato(1);
	//contatodao.updateContato(contato, 1, "nome");
	//contatodao.deteteContato(1);
//		Viagem viagem = new Viagem();
//		viagem.setDataEntrada(LocalDateTime.of(2023, 11, 20, 01, 00));
//		viagem.setDataSaida(LocalDateTime.of(2023, 12, 05, 01, 00));
//		viagem.setDesconto(20);
//		viagem.setPreco(150.00);
//		viagem.setDestino(destino);
//		viagem.setUsuario(usuario);
//		
//		System.out.println("data ida" + viagem.formatarData(viagem.getDataEntrada()) + "volta " + viagem.formatarData(viagem.getDataSaida()));
//		
//		ViagemDAO viagemdao = new ViagemDAO();
//		
//		viagemdao.createViagem(viagem, usuario, destino);
		//viagemdao.readViagem();
		//viagemdao.searchViagem(3);
		//viagemdao.updateViagem(viagem, 3, "id_usuario");
		//viagemdao.deteteViagem(4);
	
//	Hospedagem hospedagem = new Hospedagem();
//	hospedagem.setId(1);
//	hospedagem.setEndereco("Av. Atlântica, 1702 - Copacabana");
//	hospedagem.setNomeLocal("Copacabana Palace");
//	hospedagem.setPrecoDiaria(3250.00);
//	hospedagem.setDestino(destino);
	
	//HospedagemDAO h = new HospedagemDAO();
	//h.createHospedagem(hospedagem);
	//h.readHospedagem();
	//h.searchHospedagem(1);
	//h.updateHospedagem(hospedagem, 1, "precoDiaria");
	//h.deteteHospedagem(1);
	
	}

}
