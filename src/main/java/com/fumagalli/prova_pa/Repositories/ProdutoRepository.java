package com.fumagalli.prova_pa.Repositories;

import com.fumagalli.prova_pa.Models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
