package br.com.sistema.covid.service;

import org.springframework.stereotype.Service;

import br.com.sistema.covid.model.Vacina;
import br.com.sistema.covid.repository.VacinaRepository;

@Service
public class VacinaService {
	
	
	private VacinaRepository vacinaRepository;

	public VacinaService(VacinaRepository vacinaRepository) {
		this.vacinaRepository = vacinaRepository;
	}
	
	public void salvar(Vacina vacina) {
		vacinaRepository.save(vacina);
	}
	
	public void consultar(Vacina vacina) {
		vacinaRepository.save(vacina);
	}

	public void getVacinaRepository(VacinaRepository vacinaRepository) {
		this.vacinaRepository = vacinaRepository;
	}

	public void setVacinaRepository(VacinaRepository vacinaRepository) {
		this.vacinaRepository = vacinaRepository;
	}

	
	
}
