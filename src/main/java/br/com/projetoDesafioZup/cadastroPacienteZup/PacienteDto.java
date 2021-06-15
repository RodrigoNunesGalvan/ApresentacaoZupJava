package br.com.projetoDesafioZup.cadastroPacienteZup;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class PacienteDto {

	@NotBlank
	private String nome;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	@CPF
	private String cpf;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	@Past
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate nascimento;

	public Paciente toEntity() {
		Paciente paciente = new Paciente();
		paciente.setNome(this.getNome());
		paciente.setEmail(this.getEmail());
		paciente.setCpf(this.getCpf());
		paciente.setNascimento(this.getNascimento());
		return paciente;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		return "NovoPacienteForm \n[nome = " + nome + "\n, email = " + email + "\n, cpf = " + cpf + "\n, nascimento = "
				+ nascimento + "]";
	}




	
}
