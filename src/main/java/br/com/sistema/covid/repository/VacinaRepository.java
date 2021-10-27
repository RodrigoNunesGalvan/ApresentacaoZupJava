package br.com.sistema.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistema.covid.model.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {

}
