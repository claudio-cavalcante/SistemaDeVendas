package br.ufg.inf.menu;
import java.util.function.Supplier;

import br.ufg.inf.menu.MensagensSistema;
import br.ufg.inf.relatorio.Relatorio;
import br.ufg.inf.relatorio.RelatorioDeEstoque;

public class OpcaoMenuEmitirRelatorioEstoque implements IOpcaoMenu {

	@Override
	public String getNome() {
		return MensagensSistema.EMITIR_RELATORIO_ESTOQUE;
	}

	@Override
	public Supplier<Boolean> getAcao() {
		Relatorio relatorio = new RelatorioDeEstoque();
		System.out.println(relatorio.emitir());
		return () -> true;
	}
	
	@Override
	public EnumPapel[] papeisAutorizados() {
		return new EnumPapel[]{ EnumPapel.GERENTE };
	}
}
