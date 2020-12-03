package br.com.emd.essentials.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import br.com.emd.essentials.controller.dto.PaisDto;
import br.com.emd.essentials.controller.form.PaisForm;
import br.com.emd.essentials.model.Pais;
import br.com.emd.essentials.repository.PaisRepository;

@RestController
@RequestMapping("/pais")
public class PaisController {
	
	@Autowired
	PaisRepository pr;
	
	@GetMapping
	public List<PaisDto> listarPaises() {
		List<Pais> paises = pr.findAll();
		return PaisDto.converter(paises);
	}
	
	@GetMapping
	@RequestMapping("/detalhes")
	public List<PaisDto> detalharPais() {
		List<Pais> paises = pr.findAll();
		return PaisDto.converter(paises);
	}
	        
	@PostMapping
	public ResponseEntity<PaisDto> inserirPais(@RequestBody PaisForm pf, UriComponentsBuilder uriBuilder) {
		Pais p = pf.converter();
		pr.save(p);
		URI u = uriBuilder.path("/pais/{id}").buildAndExpand(p.getId()).toUri();
		return ResponseEntity.created(u).body(new PaisDto(p));
	}
	
	@PatchMapping
	public void atualizarPais() {
		
	}
	
	@DeleteMapping
	public void excluirPais() {
		
	}
	
	
}
