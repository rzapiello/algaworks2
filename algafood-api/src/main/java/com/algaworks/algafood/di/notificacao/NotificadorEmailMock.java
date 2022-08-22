package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;


@Profile("dev")
@TipoDeNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock implements Notificador {
	
	public NotificadorEmailMock() {
		System.out.println("Notificado de email MOCK");
		
	}	
	
	@Override
	public void notificar(Cliente cliente,String mensagem) {
		
		System.out.printf("Notificando SERIA %s através do e-mail %s: %s\n",
				cliente.getNome(),cliente.getEmail(),mensagem);
		
	}
}
