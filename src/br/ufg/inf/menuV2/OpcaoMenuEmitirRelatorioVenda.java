package br.ufg.inf.menuV2;
import java.util.function.Supplier;

import br.ufg.inf.menu.MensagensSistemaDeVendas;
import br.ufg.inf.relatorio.Relatorio;
import br.ufg.inf.relatorio.RelatorioDeVendas;

public class OpcaoMenuEmitirRelatorioVenda implements IOpcaoMenu {

	@Override
	public String getNome() {
		return MensagensSistemaDeVendas.EMITIR_RELATORIO_VENDA;
	}

	@Override
	public Supplier<Boolean> getAcao() {
		Relatorio relatorio = new RelatorioDeVendas();
		System.out.println(relatorio.emitir() + "\n\n");
		return () -> true;
	}
	
	@Override
	public EnumPapel[] papeisAutorizados() {
		return new EnumPapel[]{ EnumPapel.GERENTE };
	}
}