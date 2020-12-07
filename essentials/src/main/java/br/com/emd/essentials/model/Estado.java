package br.com.emd.essentials.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
@EnableAutoConfiguration
@Table(name="ESTADO")
public class Estado {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String sigla;
	
	@Column(nullable = false)
	private LocalDateTime criacao;
	
	@OneToOne
	private Pais pais;

	@OneToMany
	private List<Cidade> cidades;
	
	
}
