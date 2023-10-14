package Menu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import ClassesTabelas.Destino;
import ClassesTabelas.Usuario;
import TabelasDAO.DestinoDAO;
import TabelasDAO.UsuarioDAO;

public class SubMenu {

	private Scanner inputStr = new Scanner(System.in);
	private Scanner inputNumber = new Scanner(System.in);

	public void insert() {
		
		int subMenuNumber = 1;

		while (subMenuNumber != 0) {
			System.out.println("Em qual tabela deseja inserir novos dados ?");
			System.out.println(" [ 1 ] para Usuário");
			System.out.println(" [ 2 ] para Destino");
			System.out.println(" [ 3 ] para Hospedagem");
			System.out.println(" [ 4 ] para Viagem");
			System.out.println(" [ 5 ] para Contato");
			System.out.println(" [ 0 ] para Voltar ao menu anterior");
			subMenuNumber = inputNumber.nextInt();
			switch (subMenuNumber) {
			case 0: {
				System.out.println("Vontando para o menu anterior");
				break;
			}
			case 1: {
				Usuario usuario = new Usuario();

				System.out.println("Digite o nome do usuário");
				String nome = (inputStr.nextLine());
				System.out.println("Digite o RG do usuário *somente numeros");
				long rg = inputNumber.nextInt();
				System.out.println("Digite o endereço do usuário");
				String endereco = inputStr.nextLine();
				System.out.println("Digite o CPF do usuário *somente numeros");
				String cpf = inputStr.nextLine();
				String[] nascimento = {"Dia", "Mês","Ano"  };
				int[] data = { 0, 0, 0 };
				for (int i = 0; i < 3; i++) {
					
					System.out.println("Digite o " + nascimento[i] + " nascimento *somente numeros");
					data[i] = inputNumber.nextInt();
				}
				System.out.println("Digite o telefone do usuário com DDD *somente numeros ");
				String telefone = inputStr.nextLine();
				System.out.println("Digite o email do usuário");
				String email = inputStr.nextLine();
				System.out.println("Digite o Estado que reside o usuário");
				String estado = inputStr.nextLine();
				System.out.println("Digite a senha do usuário");
				String senha = inputStr.nextLine();
				System.out.println("Digite o tipo de usuário do usuário - Apenas user, admin, client");
				String user = inputStr.nextLine();

				if ("client".equalsIgnoreCase(user) || "user".equalsIgnoreCase(user)
						|| "admin".equalsIgnoreCase(user)) {
					usuario.setTipoUsuario(user);
				} else {
					System.out.println("tipo de usuário não existe será adicionado como client");
					usuario.setTipoUsuario("client");
				}

				usuario.setRg(String.valueOf(rg));
				usuario.setNome(nome);
				usuario.setEndereco(endereco);
				usuario.setCpf(cpf);
				usuario.setDataNascimento(LocalDate.of(data[2], data[1], data[0]));
				usuario.setTelefone(telefone);
				usuario.setCriado_em(LocalDateTime.now());
				usuario.setEmail(email);
				usuario.setEstado(estado);
				usuario.setModificado_em(LocalDateTime.now());
				usuario.setSenha(senha);

				UsuarioDAO novoUsuario = new UsuarioDAO();
				novoUsuario.creatUsuario(usuario);
				break;
			}
			case 2: {
				Destino destino = new Destino();

				System.out.println("Digite a cidade do destino");
				destino.setCidade(inputStr.nextLine());
				System.out.println("Digite detalhes do destino, *pontos turisticos,baladas... ");
				destino.setDetalhes(inputStr.nextLine());
				System.out.println("Dgite o estado do destino");
				destino.setEstado(inputStr.nextLine());
				System.out.println("Um link com a imagem do destino");
				destino.setImg(inputStr.nextLine());
				System.out.println("Digite o pais do destino");
				destino.setPais(inputStr.nextLine());

				DestinoDAO novoDestino = new DestinoDAO();
				novoDestino.createDestino(destino);
				break;
			}
			default:
				System.out.println("tente novamente");
			}

		}

	}

}
