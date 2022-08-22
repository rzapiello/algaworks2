package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@TipoDeNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	
		
	@Override
	public void notificar(Cliente cliente,String mensagem) {
		
		System.out.printf("Notificando %s POR sms através do TELEFONE %s: %s\n",
				cliente.getNome(),cliente.getTelefone(),mensagem);
		
	}
}
