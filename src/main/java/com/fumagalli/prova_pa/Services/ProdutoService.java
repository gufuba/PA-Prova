package com.fumagalli.prova_pa.Services;

import com.fumagalli.prova_pa.Models.ProdutoModel;
import com.fumagalli.prova_pa.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> listarProdutos(){
        return produtoRepository.findAll();
    }

    public ProdutoModel salvarProduto(ProdutoModel produto){
        return produtoRepository.save(produto);
    }

    public Optional<ProdutoModel> buscarProdutoPorId(Long id){
        return produtoRepository.findById(id);
    }

    public ProdutoModel atualizarProduto(Long id, ProdutoModel produto){
        ProdutoModel model = produtoRepository.findById(id).get();
        model.setNome(produto.getNome());
        model.setDescricao(produto.getDescricao());
        model.setPreco(produto.getPreco());
        model.setStatus(produto.getStatus());

        return produtoRepository.save(model);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }
}
