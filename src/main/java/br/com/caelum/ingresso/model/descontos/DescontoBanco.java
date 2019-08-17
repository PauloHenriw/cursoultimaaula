package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoBanco implements Desconto {

	private BigDecimal descontoB = new BigDecimal("0.7");
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		
		return precoOriginal.multiply(descontoB);
	}
	
	@Override
	public String getDescricao() {
		return "Desconto Banco";
	}
}
