package br.com.emd.essentials.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.emd.essentials.model.Pais;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class PaisDetalheDto {
	
	private String nome;
	private String sigla;
	private LocalDateTime criacao;
	private List<EstadoDto> estados;

	public PaisDetalheDto() {
		super();
	}

	public PaisDetalheDto(Pais pais) {
		super();
		this.nome = pais.getNome();
		this.sigla = pais.getSigla();
		this.criacao = pais.getCriacao();
		this.estados = new ArrayList<>();
		this.estados.addAll(pais.getEstados().stream().map(EstadoDto::new).collect(Collectors.toList()));
	}
	

}
