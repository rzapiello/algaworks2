package com.algaworks.algafood.jpa;



import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;


import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cidade;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.CidadeRepository;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import com.algaworks.algafood.domain.repository.FormaPagamentoRepository;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

public class TesteMain {

	
	public static void main(String[] args) {
		ApplicationContext aplicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		
		FormaPagamentoRepository formaPagamentoRepository = aplicationContext.getBean(FormaPagamentoRepository.class);
		PermissaoRepository permissaoRepository = aplicationContext.getBean(PermissaoRepository.class);
		CidadeRepository cidadeRepository = aplicationContext.getBean(CidadeRepository.class);
		CozinhaRepository cozinhaRepository = aplicationContext.getBean(CozinhaRepository.class);
		EstadoRepository estadoRepository = aplicationContext.getBean(EstadoRepository.class);		
		RestauranteRepository restauranteRepository = aplicationContext.getBean(RestauranteRepository.class);	

		FormaPagamento formaPagamento = new FormaPagamento();
		Permissao permissao = new Permissao();
		Cidade cidade = new Cidade();
		Cozinha cozinha = new Cozinha();
		Estado estado = new Estado();
		Restaurante restaurante = new Restaurante();

		System.out.println("Testar buscar");
		
		formaPagamento = formaPagamentoRepository.buscar(1L);
		System.out.println(formaPagamento.getDescricao()); 
		
		permissao = permissaoRepository.buscar(1L);
		System.out.println(permissao.getNome());
		
		cidade = cidadeRepository.buscar(1L);
		System.out.println(cidade.getNome());
		
		
		estado = estadoRepository.buscar(1L);
		System.out.println(estado.getNome());
		
		cozinha = cozinhaRepository.buscar(1L);
		System.out.println(cozinha.getNome());
		
		restaurante = restauranteRepository.buscar(1L);
		System.out.println(restaurante.getNome());
		
		

		System.out.println("Testar remover");
		formaPagamentoRepository.remover(formaPagamento);
		permissaoRepository.remover(permissao);
		cidadeRepository.remover(cidade);
		estadoRepository.remover(estado);
		restauranteRepository.remover(restaurante);
		cozinhaRepository.remover(cozinha);
		
		System.out.println("Testar inserir");
		formaPagamento.setId(99L);
		formaPagamento.setDescricao("teste");
		formaPagamentoRepository.salvar(formaPagamento);
		
		
		permissao.setId(99L);
		permissao.setNome("teste");
		permissao.setDescricao("teste");
		permissaoRepository.salvar(permissao);
		
		

		estado.setNome("teste");
		estadoRepository.salvar(estado);
		

		cidade.setNome("TESTE");
		estado = estadoRepository.buscar(2L);
		cidade.setEstado(estado);
		cidadeRepository.salvar(cidade);
		
		cozinhaRepository.salvar(cozinha);
		cozinha.setNome("TESTE");
		cozinhaRepository.salvar(cozinha);
		
		
		restaurante.setNome("TESTE");
		cozinha =  cozinhaRepository.buscar(2L);
		restaurante.setCozinha(cozinha);
		restauranteRepository.salvar(restaurante);

		

		}
}
