package com.fumagalli.prova_pa.Controllers;

import com.fumagalli.prova_pa.Models.ProdutoModel;
import com.fumagalli.prova_pa.Repositories.ProdutoRepository;
import com.fumagalli.prova_pa.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produto){
        ProdutoModel produtoModel = produtoService.salvarProduto(produto);
        return ResponseEntity.status(201).body(produtoModel);
    }

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> listarProdutos(){
        List<ProdutoModel> produtos = produtoService.listarProdutos();
        return ResponseEntity.status(200).body(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> buscarProdutoPorId(Long id){
        Optional<ProdutoModel> produto = produtoService.buscarProdutoPorId(id);
        if(produto.isPresent()){
            return ResponseEntity.status(200).body(produto.get());
        } else{
            return ResponseEntity.status(404).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoModel> atualizarProduto(@PathVariable Long id, @RequestBody ProdutoModel produto){
        ProdutoModel produtoModel = produtoService.atualizarProduto(id, produto);
        return ResponseEntity.status(200).body(produtoModel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
        if(produtoService.buscarProdutoPorId(id).isPresent()){
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
