package dao;

import org.apache.log4j.Logger;

import modelo.Cliente;

public class ClienteDAO {
	private static Logger logger = Logger.getLogger(ClienteDAO.class);

	public void salvar(Cliente cliente) {
		if (cliente == null) {
			// Regra para verificar se o usuário está informando nome para o cliente
			logger.warn("O cliente está nulo");
			return;
		}

		if (logger.isDebugEnabled()) {
			logger.debug("Salvando o cliente" + cliente);
		}

		// Salvar cliente no bd
		logger.debug("Cliente salvo com sucesso.");
	}
}
