package com.fumagalli.prova_pa.Models;

import com.fumagalli.prova_pa.Enums.StatusProduto;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_produtos")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private double preco;
    private StatusProduto status;

    public ProdutoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public StatusProduto getStatus() {
        return status;
    }
    public void setStatus(StatusProduto status) {
        this.status = status;
    }
}
