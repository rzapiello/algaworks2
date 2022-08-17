package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.service.AtivacaoClienteService;
import com.algaworks.di.notificacao.Notificador;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente joao = new Cliente("João","joao@xyz","32166926");
		Cliente maria = new Cliente("Maria","maria@xyz","1245166");
		
		Notificador notificador = new NotificadorSMS();
		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(maria);
		ativacaoCliente.ativar(joao);
		
		
	}

}
