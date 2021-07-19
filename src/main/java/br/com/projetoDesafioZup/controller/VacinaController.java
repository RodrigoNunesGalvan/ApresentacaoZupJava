package br.com.projetoDesafioZup.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetoDesafioZup.dto.VacinaDto;
import br.com.projetoDesafioZup.entity.Vacina;
import br.com.projetoDesafioZup.repository.VacinaRepository;
import br.com.projetoDesafioZup.service.VacinaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class VacinaController {

	private VacinaService vacinaService;
	
	@Autowired
	private VacinaRepository vacinaRepository;

	public VacinaController(VacinaService vacinaService) {
		this.vacinaService = vacinaService;
	}

	@PostMapping(value = "/createVacina", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String salvar(@Valid @RequestBody VacinaDto vacinaDto) {
		vacinaService.salvar(vacinaDto.toEntity());
		return vacinaDto.toString();
	}

	@GetMapping(value = "/consultaVacina", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vacina> consultar() {
		return vacinaRepository.findAll();
	}

}
