package br.ufg.inf.menu;
import java.util.function.Supplier;

import br.ufg.inf.Sessao;
import br.ufg.inf.menu.MensagensSistema;

public class OpcaoMenuLogoff implements IOpcaoMenu {

	@Override
	public String getNome() {
		return MensagensSistema.LOGOFF;
	}

	@Override
	public Supplier<Boolean> getAcao() {
		return () -> {
			Sessao.setFuncionarioLogado(null);
			return false;
		};
	}
	
	@Override
	public EnumPapel[] papeisAutorizados() {
		return new EnumPapel[]{ EnumPapel.GERENTE, EnumPapel.FUNCIONARIO };
	}

}
