package br.com.projetoDesafioZup.cadastroAplicacaoVacinaZup;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/novaAplicacao")
public class CadastroVacinaController {

	private VacinaService vacinaService;
	@Autowired
	private VacinaRepository vacinaRepository;

	public CadastroVacinaController(VacinaService vacinaService) {
		this.vacinaService = vacinaService;
	}

	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String salvar(@Valid @RequestBody VacinaDto vacinaDto) {

		vacinaService.salvar(vacinaDto.toEntity());
		return vacinaDto.toString();
	}

	@GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vacina> consultar() {

		return vacinaRepository.findAll();
	}

}
