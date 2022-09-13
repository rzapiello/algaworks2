package com.algaworks.algafood.jpa;



import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.CozinhaRepository;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

public class InclusaoRestauranteMain {

	
	public static void main(String[] args) {
		ApplicationContext aplicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		
		RestauranteRepository restauranteRepository = aplicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante = new Restaurante();
		
		restaurante.setNome("Algafood 3");
		restaurante.setTaxaFrete(new BigDecimal("0.2"));
		
		restauranteRepository.salvar(restaurante);
		
	}
}
