package br.com.emd.essentials.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.emd.essentials.controller.dto.PaisDetalheDto;
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
	@RequestMapping("/{id}")
	public ResponseEntity<PaisDetalheDto> detalharPais(@PathVariable Long id) {
		Optional<Pais> pais = pr.findById(id);
		if (pais.isPresent()) {
			return ResponseEntity.ok(new PaisDetalheDto(pais.get()));
		}
		return ResponseEntity.notFound().build();
	}
	        
	@PostMapping
	public ResponseEntity<PaisDto> inserirPais(@RequestBody @Valid PaisForm pf, UriComponentsBuilder uriBuilder) {
		Pais p = pf.converter();
		pr.save(p);
		URI u = uriBuilder.path("/pais/{id}").buildAndExpand(p.getId()).toUri();
		return ResponseEntity.created(u).body(new PaisDto(p));
	}
	
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<PaisDto> atualizarPais(@PathVariable Long id, @RequestBody @Valid PaisForm pf) {
		Pais pais = pr.getOne(id);
		pais = pf.atualizarPais(pais);
		return ResponseEntity.ok(new PaisDto(pais));
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public ResponseEntity<?> excluirPais(@PathVariable Long id) {
		pr.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	
}
