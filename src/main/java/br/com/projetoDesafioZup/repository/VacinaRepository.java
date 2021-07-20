package br.com.projetoDesafioZup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoDesafioZup.entity.VacinaEntity;

@Repository
public interface VacinaRepository extends JpaRepository<VacinaEntity, Long> {

}
