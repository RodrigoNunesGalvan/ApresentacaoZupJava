package br.com.projetoDesafioZup.cadastroAplicacaoVacinaZup;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class VacinaDto {
	
	@NotBlank
	private String nomeVacina;
	@NotBlank
	@Email
	private String emailPaciente;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	@Past
	@JsonFormat(shape = Shape.STRING,pattern = "dd/MM/yyyy")
	private LocalDate dataVacina;
	
	public Vacina toEntity() {
		Vacina vacina = new Vacina();
		vacina.setNomeVacina(this.getNomeVacina());
		vacina.setEmailPaciente(this.getEmailPaciente());
		vacina.setDataVacina(this.getDataVacina());
		return vacina;
	}
	
	public String getNomeVacina() {
		return nomeVacina;
	}
	public String getEmailPaciente() {
		return emailPaciente;
	}
	public LocalDate getDataVacina() {
		return dataVacina;
	}
	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}
	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}
	public void setDataVacina(LocalDate dataVacina) {
		this.dataVacina = dataVacina;
	}
	@Override
	public String toString() {
		return "NovaVacinacao \n[nomeVacina = " + nomeVacina + "\n, emailPaciente = " + emailPaciente + "\n, dataVacina = "
				+ dataVacina + "]";
	}
	
	
	
	
	
}
