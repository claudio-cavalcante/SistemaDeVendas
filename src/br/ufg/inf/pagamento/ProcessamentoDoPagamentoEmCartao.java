package br.ufg.inf.pagamento;

import java.util.Random;

public class ProcessamentoDoPagamentoEmCartao implements IProcessamentoDoPagamento {

	private Boolean pagamentoRealizadoComSucesso;
	private double valorPago;
	
	public ProcessamentoDoPagamentoEmCartao(double valorPago){
		this.valorPago = valorPago;
	}
	
	@Override
	public boolean pagamentoRealizadoComSucesso() {			
		if(pagamentoRealizadoComSucesso == null ){
			pagamentoRealizadoComSucesso = new Random().nextBoolean() || this.valorPago < 1000;
		}
		
		return pagamentoRealizadoComSucesso;
	}

	@Override
	public boolean houveTroco() {
		return false;
	}

	@Override
	public double valorDoTroco() {
		return 0;
	}

	@Override
	public String mensagem() {
		return pagamentoRealizadoComSucesso() ? "TRANSA��O EFETUADA!" : "TRANSA��O N�O AUTORIZADA";
	}

}