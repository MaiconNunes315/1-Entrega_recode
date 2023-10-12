package TabelasDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import ClassesTabelas.Destino;
import ClassesTabelas.Usuario;
import ClassesTabelas.Viagem;
import Conexao.Conexao;

public class ViagemDAO {
	private String sql;
	private Connection conexao;

	public void createViagem(Viagem viagem, Usuario usuario, Destino destino) {
		sql = "INSERT INTO viagem (observacoes, desconto, "
				+ "dataEntrada, dataSaida,preco, id_destino, id_usuario) VALUES "

				+ "(?, ?, ?,?, ?, ?,?)";
		conexao = Conexao.conectar();
		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {
			pstm.setString(1, viagem.getObservacoes());
			pstm.setInt(2, viagem.getDesconto());
			pstm.setTimestamp(3, Timestamp.valueOf(viagem.getDataEntrada()));
			pstm.setTimestamp(4, Timestamp.valueOf(viagem.getDataSaida()));
			pstm.setDouble(5, viagem.getPreco());
			pstm.setInt(6, destino.getId_destino());
			pstm.setInt(7, usuario.getId());
			pstm.executeUpdate();

			System.out.println("Viagem " + viagem.getDataEntrada() + " Cadastrado com sucesso");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void readViagem() {
		sql = "SELECT * FROM viagem A INNER JOIN usuario B ON A.id_usuario = B.id INNER JOIN destino C ON A.id_destino = C.id_destino";
		conexao = Conexao.conectar();
		ResultSet rset = null;
		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			rset = pstm.executeQuery();
			while (rset.next()) {

				Viagem viagem = new Viagem();
				Destino destino = new Destino();
				Usuario usuario = new Usuario();

				viagem.setId_viagem(rset.getInt("id_viagem"));
				viagem.setObservacoes(rset.getString("observacoes"));
				viagem.setPreco(rset.getDouble("preco"));
				viagem.setDesconto(rset.getInt("desconto"));
				viagem.setDataEntrada(rset.getTimestamp("dataEntrada").toLocalDateTime());
				viagem.setDataSaida(rset.getTimestamp("dataSaida").toLocalDateTime());
				destino.setId_destino(rset.getInt("id_destino"));
				destino.setCidade(rset.getString("cidade"));
				destino.setDetalhes(rset.getString("detalhes"));
				destino.setEstado(rset.getString("estado"));
				destino.setImg(rset.getString("img"));
				destino.setPais(rset.getString("pais"));
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
				viagem.setDestino(destino);
				viagem.setUsuario(usuario);

				System.out.println(viagem.toString());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void searchViagem(int id) {
		sql = "SELECT * FROM viagem A INNER JOIN usuario B ON A.id_usuario = B.id INNER JOIN destino C ON A.id_destino = C.id_destino"
				+ " WHERE id_viagem = " + id;
		conexao = Conexao.conectar();
		ResultSet rset = null;
		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			rset = pstm.executeQuery();
			while (rset.next()) {

				Viagem viagem = new Viagem();
				Destino destino = new Destino();
				Usuario usuario = new Usuario();

				viagem.setId_viagem(rset.getInt("id_viagem"));
				viagem.setObservacoes(rset.getString("observacoes"));
				viagem.setPreco(rset.getDouble("preco"));
				viagem.setDesconto(rset.getInt("desconto"));
				viagem.setDataEntrada(rset.getTimestamp("dataEntrada").toLocalDateTime());
				viagem.setDataSaida(rset.getTimestamp("dataSaida").toLocalDateTime());
				destino.setId_destino(rset.getInt("id_destino"));
				destino.setCidade(rset.getString("cidade"));
				destino.setDetalhes(rset.getString("detalhes"));
				destino.setEstado(rset.getString("estado"));
				destino.setImg(rset.getString("img"));
				destino.setPais(rset.getString("pais"));
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
				viagem.setDestino(destino);
				viagem.setUsuario(usuario);

				System.out.println(viagem.toString());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void updateViagem(Viagem viagem, int id, String campo) {
		conexao = Conexao.conectar();
		sql = "UPDATE viagem SET " + campo + " = ? WHERE id_viagem = " + id;

		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			switch (campo) {
			case "desconto": {
				pstm.setInt(1, viagem.getDesconto());
				pstm.executeUpdate();
				break;
			}
			case "observacoes": {

				pstm.setString(1, viagem.getObservacoes());
				pstm.executeUpdate();
				break;
			}
			case "preco": {
				pstm.setDouble(1, viagem.getPreco());
				pstm.executeUpdate();
				break;
			}
			case "dataEntrada": {

				pstm.setTimestamp(1, Timestamp.valueOf(viagem.getDataEntrada()));
				pstm.executeUpdate();
				break;
			}
			case "dataSaida": {

				pstm.setTimestamp(1, Timestamp.valueOf(viagem.getDataSaida()));
				pstm.executeUpdate();
				break;
			}
			case "id_destino": {

				pstm.setInt(1, viagem.getDestino().getId_destino());
				pstm.executeUpdate();
				break;
			}
			case "id_usuario": {

				pstm.setInt(1, viagem.getUsuario().getId());
				pstm.executeUpdate();
				break;
			}

			default: {
				System.out.println("Opção incorreta");
				break;
			}
			}

			System.out.println("Viagem Atualizada com sucesso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deteteViagem(int id) {
		conexao = Conexao.conectar();
		sql = "DELETE FROM viagem WHERE id_viagem = ?";

		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			pstm.setInt(1, id);
			pstm.execute();

			System.out.println("Viagem deletada com sucesso");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
