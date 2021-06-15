package br.com.projetoDesafioZup.cadastroPacienteZup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{
	public Paciente findByEmail(String email);
	public Paciente findByCpf(String cpf);
	
}
