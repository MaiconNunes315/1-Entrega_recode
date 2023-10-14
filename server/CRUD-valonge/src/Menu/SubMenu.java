package Menu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.Scanner;

import ClassesTabelas.Usuario;
import TabelasDAO.UsuarioDAO;

public class SubMenu {

	public void insert() {
		Scanner input = new Scanner(System.in);

		System.out.println("Em qual tabela deseja inserir novos dados ?");
		System.out.println("Digite 1 para Usuário");
		System.out.println("Digite 2 para Destino");
		System.out.println("Digite 3 para Hospedagem");
		System.out.println("Digite 4 para Viagem");
		System.out.println("Digite 5 para Contato");

		int subMenuNumber = 1;

		while (subMenuNumber != 0) {

			switch (subMenuNumber) {
			case 1: {
				Usuario usuario = new Usuario();
				System.out.println("Digite o nome do usuário");
				usuario.setNome(input.nextLine().trim());
				System.out.println("Digite o RG do usuário *somente numeros");
				String rg = input.next().trim();
				usuario.setRg(rg.replaceAll("/[^0-9]/g", ""));
				System.out.println("Digite o endereço do usuário");
				usuario.setEndereco(input.nextLine().trim());
				System.out.println("Digite o CPF do usuário *somente numeros");
				String cpf = input.next().trim();
				usuario.setCpf(cpf.replaceAll("/[^0-9]/g", ""));
				String[] nascimento = {"Ano", "Mês", "Dia"};
				int[] data = {0, 0, 0};
				for (int i = 0; i < 3; i++) {
					System.out.println("data de nacimento do usuário ");
					System.out.println("Digite o " + nascimento[i] + " nascimento");
					data[i] = input.nextInt();
				}
				usuario.setDataNascimento(LocalDate.of(data[0],data[1], data[2]));
				System.out.println("Digite o telefone do usuário *somente numeros");
				usuario.setTelefone(input.next().trim());
				usuario.setCriado_em(LocalDateTime.now());
				System.out.println("Digite o email do usuário");
				usuario.setEmail(input.next().trim());
				System.out.println("Digite o Estado que reside o usuário");
				usuario.setEstado(input.nextLine().trim());
				usuario.setModificado_em(LocalDateTime.now());
				System.out.println("Digite a senha do usuário");
				usuario.setSenha(input.next().trim());
				System.out.println("Digite o tipo de usuário do usuário - Apenas user, admin, client");
				String user = input.next().trim();
				if("client".equalsIgnoreCase(user) || "user".equalsIgnoreCase(user) || "admin".equalsIgnoreCase(user)) {				
					usuario.setTipoUsuario(user);
				}else {
					System.out.println("tipo de usuário não existe será adicionado como client");
					usuario.setTipoUsuario("client");
				}
				
				UsuarioDAO novoUsuario = new UsuarioDAO();
				novoUsuario.creatUsuario(usuario);
				break;
			}
			default:
				System.out.println("tente novamente");
			}

		}

	}

}
