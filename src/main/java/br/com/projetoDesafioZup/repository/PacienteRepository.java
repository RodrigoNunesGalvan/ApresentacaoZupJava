package br.com.projetoDesafioZup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoDesafioZup.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
	public Paciente findByEmail(String email);
	public Paciente findByCpf(String cpf);
	
}
