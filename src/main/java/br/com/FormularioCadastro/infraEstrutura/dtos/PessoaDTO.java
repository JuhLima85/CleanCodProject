package br.com.FormularioCadastro.infraEstrutura.dtos;

import br.com.FormularioCadastro.core.enums.EnumTipoPessoa;

public record PessoaDTO(
        String nome,
        String email,
        String cpfCnj,
        EnumTipoPessoa tipo
) {

}
