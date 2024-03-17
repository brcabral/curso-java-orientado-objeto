package dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import dao.ClienteDAO;
import dao.DAOFactory;

public class JdbcDAOFactory extends DAOFactory {
	private Connection connection;

	public JdbcDAOFactory() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/cadastro_cliente", "root",
					"dev123");
		} catch (Exception e) {
			throw new RuntimeException("Erro recuperando conexão com o banco", e);
		}
	}

	@Override
	public ClienteDAO getClienteDAO() {
		return new JdbcClienteDAO(connection);
	}
}
