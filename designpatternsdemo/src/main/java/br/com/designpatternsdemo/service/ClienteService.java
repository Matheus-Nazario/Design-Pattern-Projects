package br.com.designpatternsdemo.service;

import br.com.designpatternsdemo.model.Cliente;
import br.com.designpatternsdemo.model.ClienteRepository;
import br.com.designpatternsdemo.model.Endereco;
import br.com.designpatternsdemo.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * *
 * *
 * *
 * @author Matheus Nazário
 */
@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {

        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {

        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
        System.out.println();
    }


    @Override
    public void atualizar(Long id, Cliente cliente) {
    Optional<Cliente> clienteBd = clienteRepository.findById(id);
    if(clienteBd.isPresent()){
        salvarClienteComCep(cliente);
    }
    }

    @Override
    public void deletar(long id) {
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;});

        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
