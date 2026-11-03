package br.com.fatec.sistemacomercioweb.service;

import br.com.fatec.sistemacomercioweb.model.Produto;
import br.com.fatec.sistemacomercioweb.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    // Injeção de dependência via construtor para o repositório de produtos
    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    // Retorna a lista de todos os produtos do banco Neon
    public List<Produto> listar() {
        return repository.findAll();
    }

    // Salva ou atualiza um produto no banco de dados
    public Produto cadastrar(Produto produto) {
        return repository.save(produto);
    }
}
