package br.com.emd.essentials.controller.form;

import java.time.LocalDateTime;

import br.com.emd.essentials.model.Pais;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PaisForm {
	
	private String nome;
	private String sigla;
	private LocalDateTime criacao;
	
	public Pais converter() {
		return new Pais(nome, sigla, criacao);
	}

}
