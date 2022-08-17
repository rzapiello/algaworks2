package com.algaworks.di.modelo.service;

import org.springframework.stereotype.Component;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
 	private NotificadorEmail notificador;


 	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		this.notificador.notificar(cliente, "seu cadastro esta ativo");
	}

}

