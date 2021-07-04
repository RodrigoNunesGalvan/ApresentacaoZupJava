package br.com.projetoDesafioZup.cadastroPacienteZup;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/novoPaciente")
public class CadastroPacienteController {

	private EmailDuplicado emailDuplicado;
	private CpfDuplicado cpfDuplicado;
	private PacienteService pacienteService;
	@Autowired
	private PacienteRepository pacienteRepository;

	public CadastroPacienteController(EmailDuplicado emailDuplicado, CpfDuplicado cpfDuplicado,
			PacienteService pacienteService) {
		this.emailDuplicado = emailDuplicado;
		this.cpfDuplicado = cpfDuplicado;
		this.pacienteService = pacienteService;
	}

	@InitBinder
	public void init(WebDataBinder webDataBinder) {
		webDataBinder.addValidators(emailDuplicado, cpfDuplicado);
	}

	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String salvar(@Valid @RequestBody PacienteDto pacienteDto) {

		pacienteService.salvar(pacienteDto.toEntity());
		return pacienteDto.toString();
	}

	@GetMapping(value = "/consulta", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Paciente> consultar() {
		return pacienteRepository.findAll();
	}

}
