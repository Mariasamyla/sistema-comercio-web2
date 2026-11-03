package br.com.fatec.sistemacomercioweb.repository;

import br.com.fatec.sistemacomercioweb.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
