package br.com.designpatternsdemo.service;

import br.com.designpatternsdemo.model.Cliente;
/**
 * *
 * *
 * *
 * @author Matheus Nazário
 */
public interface IClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);

    void deletar(long id);
}
