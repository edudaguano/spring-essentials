package br.com.emd.essentials.controller.dto;

import java.time.LocalDateTime;

import br.com.emd.essentials.model.Estado;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class EstadoDto {
	
	private String nome;
	private String sigla;
	private LocalDateTime criacao;
	
	public EstadoDto(Estado e) {
		super();
		this.nome = e.getNome();
		this.sigla = e.getSigla();
		this.criacao = e.getCriacao();
	}


}
