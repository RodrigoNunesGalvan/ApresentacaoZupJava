package br.com.projetoDesafioZup.service;

import org.springframework.stereotype.Service;

import br.com.projetoDesafioZup.entity.VacinaEntity;
import br.com.projetoDesafioZup.repository.VacinaRepository;

@Service
public class VacinaService {
	
	
	private VacinaRepository vacinaRepository;

	public VacinaService(VacinaRepository vacinaRepository) {
		this.vacinaRepository = vacinaRepository;
	}
	
	public void salvar(VacinaEntity vacina) {
		vacinaRepository.save(vacina);
	}
	
	public void consultar(VacinaEntity vacina) {
		vacinaRepository.save(vacina);
	}

	public void getVacinaRepository(VacinaRepository vacinaRepository) {
		this.vacinaRepository = vacinaRepository;
	}

	public void setVacinaRepository(VacinaRepository vacinaRepository) {
		this.vacinaRepository = vacinaRepository;
	}

	
	
}
