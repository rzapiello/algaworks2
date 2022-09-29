package com.algaworks.algafood.api.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.HttpHeadResponseDecorator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.api.model.CozinhaXmlWrapper;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaControler {
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	@GetMapping
	public List<Cozinha> listar(){
		return cozinhaRepository.listar();
	}
	
	
	@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE })
	public CozinhaXmlWrapper listarXml(){
		return new CozinhaXmlWrapper(cozinhaRepository.listar());
	}
	

	@GetMapping("/{cozinhaId}")
	public ResponseEntity<Cozinha> buscar(@PathVariable Long cozinhaId) {
		Cozinha cozinha = cozinhaRepository.buscar(cozinhaId);
		
		//return ResponseEntity.status(HttpStatus.OK).body(cozinha);
		
		if (cozinha != null) {
		return ResponseEntity.ok(cozinha);
		}
		
		return ResponseEntity.notFound().build();

	//** Exemplo de redirecionamento **//
	//	HttpHeaders headers = new HttpHeaders();
	//headers.add(HttpHeaders.LOCATION,"http://api.algafood.local:8080/cozinha");
	//return ResponseEntity.status(HttpStatus.FOUND).headers(headers).build();
	//** Exemplo de redirecionamento **//
	
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cozinha adicionar (@RequestBody Cozinha cozinha) {
		return cozinhaRepository.salvar(cozinha);
		
	}
	
	

}
