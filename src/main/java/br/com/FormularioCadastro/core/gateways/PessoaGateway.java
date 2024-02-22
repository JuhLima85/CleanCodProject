package br.com.FormularioCadastro.core.gateways;

import br.com.FormularioCadastro.core.domain.Pessoa;

public interface PessoaGateway {
    Pessoa createPessoa(Pessoa pessoa);
}
