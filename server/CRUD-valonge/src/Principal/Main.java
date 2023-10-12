package Principal;

import java.time.LocalDateTime;

import ClassesTabelas.Contato;
import ClassesTabelas.Destino;
import ClassesTabelas.Usuario;
import ClassesTabelas.Viagem;
import TabelasDAO.ContatoDAO;
import TabelasDAO.DestinoDAO;
import TabelasDAO.UsuarioDAO;
import TabelasDAO.ViagemDAO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Usuario usuario = new Usuario();
//
	usuario.setId(4);
// usuario.setNome("Marli Nunes");
//	usuario.setRg("222222775");
//	usuario.setEndereco("Rua 10 lt 21 qd 70");
//	usuario.setCpf("25465542122");
//	usuario.setDataNascimento(LocalDate.of(1995,05,29));
//	usuario.setTelefone("2199999999");
//	usuario.setCriado_em(LocalDateTime.now());
//	usuario.setEmail("mnunes315@gmail.com");
//	usuario.setEstado("Rio de Janeiro");
//	usuario.setModificado_em(LocalDateTime.now());
//	usuario.setSenha("987654321");
//	usuario.setTipoUsuario("user");
//	
	UsuarioDAO novoUsuario = new UsuarioDAO();
	//novoUsuario.criarUsuario(usuario);
		//novoUsuario.buscarUsuarios(3);
	//novoUsuario.detelarUsuario(1);
	//novoUsuario.atualizarUsuario(usuario, 3, "nome");	
	Destino destino = new Destino();
//	destino.setCidade("Angra dos Reis");
//	destino.setDetalhes("O rio de janeiro continua lindo, o rio de janeiro continua sendo");
//	destino.setEstado("Alagoas");
	destino.setId_destino(3);
//	destino.setImg("https://brazilexpedition.com/wp-content/uploads/2021/09/Lagoa-Azul3-625x430.jpg");
//	destino.setPais("Brasil");
//	destino.setPossuiPromocao(0);
//	
//	DestinoDAO novoDestino = new DestinoDAO();
	//novoDestino.createDestino(destino);
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
//	Viagem viagem = new Viagem();
//		viagem.setDataEntrada(LocalDateTime.of(2023, 11, 20, 01, 00));
//		viagem.setDataSaida(LocalDateTime.of(2023, 12, 05, 01, 00));
//		viagem.setDesconto(20);
//		viagem.setPreco(150.00);
//		viagem.setDestino(destino);
//		viagem.setUsuario(usuario);
//		
//		System.out.println("data ida" + viagem.formatarData(viagem.getDataEntrada()) + "volta " + viagem.formatarData(viagem.getDataSaida()));
//		
	//	ViagemDAO viagemdao = new ViagemDAO();
		
		//viagemdao.createViagem(viagem, usuario, destino);
		//viagemdao.readViagem();
		//viagemdao.searchViagem(3);
		//viagemdao.updateViagem(viagem, 3, "id_usuario");
		//viagemdao.deteteViagem(4);
			}

}
