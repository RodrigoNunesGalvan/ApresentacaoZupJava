package br.com.projetoDesafioZup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoDesafioZup.entity.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {

}
