package com.algaworks.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.service.ClienteAtivadoEvent;


@Component
public class EmissaoNotaFiscalService {
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fical para o cliente " + event.getCliente().getNome());
		
	}

}
