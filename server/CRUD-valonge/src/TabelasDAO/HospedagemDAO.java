package TabelasDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ClassesTabelas.Destino;
import ClassesTabelas.Hospedagem;
import Conexao.Conexao;

public class HospedagemDAO {
	private String sql;
	private Connection conexao;

	public void createHospedagem(Hospedagem hospedagem) {
		sql = "INSERT INTO hospedagem (nomeLocal, precoDiaria, " + "endereco, id_destino) VALUES " + "(?, ?, ?,?)";
		conexao = Conexao.conectar();
		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {
			pstm.setString(1, hospedagem.getNomeLocal());
			pstm.setDouble(2, hospedagem.getPrecoDiaria());
			pstm.setString(3, hospedagem.getEndereco());
			pstm.setInt(4, hospedagem.getDestino().getId_destino());
			pstm.executeUpdate();

			System.out.println("Hospedagem em " + hospedagem.getNomeLocal() + " Cadastrado com sucesso");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void readHospedagem() {
		sql = "SELECT * FROM hospedagem H INNER JOIN destino D ON H.id_hospedagem = D.id_destino";
		conexao = Conexao.conectar();
		ResultSet rset = null;
		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			rset = pstm.executeQuery();
			while (rset.next()) {

				Hospedagem hospedagem = new Hospedagem();
				Destino destino = new Destino();

				hospedagem.setId(rset.getInt("id_hospedagem"));
				hospedagem.setEndereco(rset.getString("endereco"));
				hospedagem.setNomeLocal(rset.getString("nomeLocal"));
				hospedagem.setPrecoDiaria(rset.getDouble("precoDiaria"));
				hospedagem.setDestino(destino);
				destino.setId_destino(rset.getInt("id_destino"));
				destino.setCidade(rset.getString("cidade"));
				destino.setDetalhes(rset.getString("detalhes"));
				destino.setEstado(rset.getString("estado"));
				destino.setImg(rset.getString("img"));
				destino.setPais(rset.getString("pais"));

				System.out.println(hospedagem.toString());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public void searchHospedagem(int id) {
		sql = "SELECT * FROM hospedagem H INNER JOIN destino D ON H.id_hospedagem = D.id_destino WHERE id_hospedagem = " + id;
		conexao = Conexao.conectar();
		ResultSet rset = null;
		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			rset = pstm.executeQuery();
			while (rset.next()) {

				Hospedagem hospedagem = new Hospedagem();
				Destino destino = new Destino();

				hospedagem.setId(rset.getInt("id_hospedagem"));
				hospedagem.setEndereco(rset.getString("endereco"));
				hospedagem.setNomeLocal(rset.getString("nomeLocal"));
				hospedagem.setPrecoDiaria(rset.getDouble("precoDiaria"));
				hospedagem.setDestino(destino);
				destino.setId_destino(rset.getInt("id_destino"));
				destino.setCidade(rset.getString("cidade"));
				destino.setDetalhes(rset.getString("detalhes"));
				destino.setEstado(rset.getString("estado"));
				destino.setImg(rset.getString("img"));
				destino.setPais(rset.getString("pais"));

				System.out.println(hospedagem.toString());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void updateHospedagem(Hospedagem hospedagem, int id, String campo) {
		conexao = Conexao.conectar();
		sql = "UPDATE hospedagem SET " + campo + " = ? WHERE id_hospedagem = " + id;

		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			switch (campo) {
			case "nomeLocal": {
				pstm.setString(1, hospedagem.getNomeLocal());
				pstm.executeUpdate();
				break;
			}
			case "precoDiaria": {
				pstm.setDouble(1, hospedagem.getPrecoDiaria());
				pstm.executeUpdate();
				break;
			}
			case "endereco": {

				pstm.setString(1, hospedagem.getEndereco());
				pstm.executeUpdate();
				break;
			}
			case "id_destino": {

				pstm.setInt(1, hospedagem.getDestino().getId_destino());
				pstm.executeUpdate();
				break;
			}
			
			default: {
				System.out.println("Opção incorreta");
				break;
			}
			}

			System.out.println("Hospedagem em " + hospedagem.getNomeLocal() + "Atualizado com sucesso");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deteteHospedagem(int id) {
		conexao = Conexao.conectar();
		sql = "DELETE FROM hospedagem WHERE id_hospedagem = ?";

		try (PreparedStatement pstm = conexao.prepareStatement(sql)) {

			pstm.setInt(1, id);
			pstm.execute();

			System.out.println("hospedagem deletado com sucesso");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
