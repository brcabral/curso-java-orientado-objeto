package dao;

import java.util.List;

import modelo.Cliente;

public interface ClienteDAO {
	public void salvar(Cliente cliente);

	public Cliente buscarPeloCodigo(Long codigo);

	public List<Cliente> buscarTodos();
}
