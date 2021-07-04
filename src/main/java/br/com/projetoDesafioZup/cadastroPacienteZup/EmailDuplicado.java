package br.com.projetoDesafioZup.cadastroPacienteZup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class EmailDuplicado implements Validator {

	@Autowired
	private PacienteRepository pacienteRepository;

	public EmailDuplicado() {
	}
	

	@Override
	public boolean supports(Class<?> clazz) {
		return PacienteDto.class.isAssignableFrom(clazz);

	}

	@Override
	public void validate(Object target, Errors errors) {

		if (errors.hasErrors()) { // se tiver erro retorna.
			return;
		}

		PacienteDto form = (PacienteDto) target;

		Paciente paciente = pacienteRepository.findByEmail(form.getEmail());
		if (paciente != null) {
			errors.rejectValue("email: " + form.getEmail(), null, "Esse email já está cadastrado...");
		}
	}

}
