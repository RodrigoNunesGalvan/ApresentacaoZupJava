package br.com.sistema.covid.service;

import org.springframework.stereotype.Service;

import br.com.sistema.covid.model.Paciente;
import br.com.sistema.covid.repository.PacienteRepository;

@Service
public class PacienteService {
	
	private PacienteRepository pacienteRepository;

	public PacienteService(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}
	
	public void salvar(Paciente paciente) {
		pacienteRepository.save(paciente);
	}

	public void consultar(Paciente paciente) {
		pacienteRepository.save(paciente);
		
	}

	public void getPacienteRepository(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}

	public void setPacienteRepository(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}

	
}
