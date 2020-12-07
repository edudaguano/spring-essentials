package br.com.emd.essentials.controller.form;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.emd.essentials.model.Pais;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PaisForm {
	
	@NotNull @NotEmpty
	private String nome;
	
	@NotNull @NotEmpty
	private String sigla;
	
	@NotNull
	private LocalDateTime criacao;
	
	public Pais converter() {
		return new Pais(nome, sigla, criacao);
	}
	
	public Pais atualizarPais(Pais p) {
		p.setNome(this.nome);
		p.setSigla(this.sigla);
		return p;
	}

}
