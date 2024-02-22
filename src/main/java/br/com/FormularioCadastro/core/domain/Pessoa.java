package br.com.FormularioCadastro.core.domain;

import br.com.FormularioCadastro.core.enums.EnumTipoPessoa;

public record Pessoa(
        Long id,
        String nome,
        String email,
        String cpfCnj,
        EnumTipoPessoa tipo
) {
}
