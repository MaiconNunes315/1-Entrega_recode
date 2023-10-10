package TableasDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.mysql.cj.protocol.a.LocalDateTimeValueEncoder;

import ClassesTabelas.Usuario;
import Conexao.Conexao;

public class UsuarioDao {

	private String sql;
	private Connection conexao;

	// Criando Usuário para o banco de dados
	public void criarUsuario(Usuario usuario) {
		conexao = Conexao.conectar();
		sql = "INSERT INTO usuario (nome, rg, endereco, cpf, estado, "
				+ "dataNascimento, telefone, criado_em, modificado_em, senha, "
				+ "email, tipoUsuario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getRg());
			pstm.setString(3, usuario.getEndereco());
			pstm.setString(4, usuario.getCpf());
			pstm.setString(5, usuario.getEstado());
			pstm.setTimestamp(6, Timestamp.valueOf(usuario.getDataNascimento().atStartOfDay()));
			pstm.setString(7, usuario.getTelefone());
			pstm.setTimestamp(8, Timestamp.valueOf(usuario.getCriado_em()));
			pstm.setTimestamp(9, Timestamp.valueOf(usuario.getModificado_em()));
			pstm.setString(10, usuario.getSenha());
			pstm.setString(11, usuario.getEmail());
			pstm.setString(12, usuario.getTipoUsuario());

			pstm.executeUpdate();
			System.out.println("usuário " + usuario.getNome() + " cadastrado com  sucesso");
		} catch (SQLException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

	// Listando usuarios do banco de dados
	public void mostrarUsuarios() {
		conexao = Conexao.conectar();
		sql = "SELECT * FROM usuario";
		ResultSet rset = null;
		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {
			rset = pstm.executeQuery();

			while (rset.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rset.getInt("id"));
				usuario.setNome(rset.getString("nome"));
				usuario.setRg(rset.getString("rg"));
				usuario.setEndereco(rset.getString("endereco"));
				usuario.setCpf(rset.getString("cpf"));
				usuario.setEstado(rset.getString("estado"));
				usuario.setDataNascimento(rset.getTimestamp("dataNascimento").toLocalDateTime().toLocalDate());
				usuario.setTelefone(rset.getString("telefone"));
				usuario.setCriado_em(rset.getTimestamp("criado_em").toLocalDateTime());
				usuario.setModificado_em(rset.getTimestamp("modificado_em").toLocalDateTime());
				usuario.setSenha(rset.getString("senha"));
				usuario.setEmail(rset.getString("email"));
				usuario.setTipoUsuario(rset.getString("tipoUsuario"));

				System.out.println(usuario.toString());
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	//buscar usuario através do id
	public void buscarUsuarios(int id) {
		conexao = Conexao.conectar();
		sql = "SELECT * FROM usuario WHERE id = " + id;
		ResultSet rset = null;
		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {
			rset = pstm.executeQuery();

			while (rset.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rset.getInt("id"));
				usuario.setNome(rset.getString("nome"));
				usuario.setRg(rset.getString("rg"));
				usuario.setEndereco(rset.getString("endereco"));
				usuario.setCpf(rset.getString("cpf"));
				usuario.setEstado(rset.getString("estado"));
				usuario.setDataNascimento(rset.getTimestamp("dataNascimento").toLocalDateTime().toLocalDate());
				usuario.setTelefone(rset.getString("telefone"));
				usuario.setCriado_em(rset.getTimestamp("criado_em").toLocalDateTime());
				usuario.setModificado_em(rset.getTimestamp("modificado_em").toLocalDateTime());
				usuario.setSenha(rset.getString("senha"));
				usuario.setEmail(rset.getString("email"));
				usuario.setTipoUsuario(rset.getString("tipoUsuario"));

				System.out.println(usuario.toString());
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	//atualizar um campo do usuario
	public void atualizarUsuario(Usuario usuario, int id, String campo) {
		conexao = Conexao.conectar();
		sql = "UPDATE usuario SET "+ campo + " = ? , modificado_em = now() WHERE id = " + id;

		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

				switch (campo) {
				case "nome": {
					pstm.setString(1, usuario.getNome());
					pstm.executeUpdate();
					break;
				}
				case "rg": {
					
					pstm.setString(1, usuario.getRg());
					pstm.executeUpdate();
					break;
				}
				case "endereco": {
					pstm.setString(1, usuario.getEndereco());
					pstm.executeUpdate();
					break;
				}
				case "cpf": {
					
					pstm.setString(1, usuario.getCpf());
					pstm.executeUpdate();
					break;
				}
				case "estado": {
					
					pstm.setString(1, usuario.getEstado());
					pstm.executeUpdate();
					break;
				}
				case "dataNascimento": {
					
					pstm.setTimestamp(1, Timestamp.valueOf(usuario.getDataNascimento().atStartOfDay()));
					pstm.executeUpdate();
					break;
				}
				case "telefone": {
					
					pstm.setString(1, usuario.getTelefone());
					pstm.executeUpdate();
					break;
				}
				case "email": {
					
					pstm.setString(1, usuario.getEmail());
					pstm.executeUpdate();
					break;
				}
				case "senha": {
					
					pstm.setString(1, usuario.getSenha());
					pstm.executeUpdate();
					break;
				}
				default:{
					System.out.println("Opção incorreta");
				}
				}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	//deletar um usuario
	public void detelarUsuario(int id) {
		conexao = Conexao.conectar();
		sql = "DELETE FROM usuario WHERE id = ?";

		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			pstm.setInt(1, id);
			pstm.execute();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
