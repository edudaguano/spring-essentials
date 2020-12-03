package br.com.emd.essentials.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.emd.essentials.model.Pais;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PaisDto {
	
	private String nome;
	private String sigla;
	private LocalDateTime criacao;
	
	public PaisDto(Pais p) {
		super();
		this.nome = p.getNome();
		this.sigla = p.getSigla();
		this.criacao = p.getCriacao();
	}

	public static List<PaisDto> converter(List<Pais> p) {
		List<PaisDto> pdto = p.stream().map(PaisDto::new).collect(Collectors.toList());
		return pdto;
	}

}
