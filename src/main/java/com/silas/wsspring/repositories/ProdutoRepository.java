package com.silas.wsspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.silas.wsspring.domain.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Integer> {

}
