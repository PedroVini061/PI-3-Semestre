package com.loja.construcao.pi3semestre.service;

import com.loja.construcao.pi3semestre.model.Produto;
import com.loja.construcao.pi3semestre.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo) {
        this.repo = repo;
    }

    public List<Produto> listarTodos() {
        return repo.findAll();
    }

    public Optional<Produto> buscarPorId(String id) {
        return repo.findById(id);
    }

    public Produto salvar(Produto produto) {
        return repo.save(produto);
    }

    public Produto atualizar(String id, Produto produto) {
        produto.setId(id);
        return repo.save(produto);
    }

    public void excluir(String id) {
        repo.deleteById(id);
    }
}
