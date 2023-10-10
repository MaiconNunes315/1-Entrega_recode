package Principal;

import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import ClassesTabelas.Usuario;
import Conexao.Conexao;
import TableasDAO.UsuarioDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Usuario usuario = new Usuario();
//
//	usuario.setId(1);
usuario.setNome("Marli Nunes");
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
	UsuarioDao novoUsuario = new UsuarioDao();
	//novoUsuario.criarUsuario(usuario);
		
	//novoUsuario.detelarUsuario(1);
	//novoUsuario.atualizarUsuario(usuario, 3, "nome");	
	}

}
