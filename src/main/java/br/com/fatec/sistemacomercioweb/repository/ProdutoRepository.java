package br.com.fatec.sistemacomercioweb.repository;

import br.com.fatec.sistemacomercioweb.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
