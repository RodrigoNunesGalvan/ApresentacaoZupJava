package br.com.projetoDesafioZup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoDesafioZup.entity.PacienteEntity;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteEntity, Long>{
	public PacienteEntity findByEmail(String email);
	public PacienteEntity findByCpf(String cpf);
	
}
