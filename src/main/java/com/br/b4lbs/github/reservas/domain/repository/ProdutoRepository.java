package com.br.b4lbs.github.reservas.domain.repository;

import com.br.b4lbs.github.reservas.domain.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
