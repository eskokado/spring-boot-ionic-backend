package com.nelioalves.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.nelioalves.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmation(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
