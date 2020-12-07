package br.com.emd.essentials.config.validacao;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class FormError {

	private String campo;
	private String erro;
	
	public FormError(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}

	public FormError() {
		super();
	}
	
}
