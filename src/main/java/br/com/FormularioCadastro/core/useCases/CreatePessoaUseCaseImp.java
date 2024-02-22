package br.com.FormularioCadastro.core.useCases;

import br.com.FormularioCadastro.core.domain.Pessoa;
import br.com.FormularioCadastro.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImp implements CreatePessoaUseCase {

    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImp(PessoaGateway pessoaGateway){
        this.pessoaGateway = pessoaGateway;
    }
    @Override
    public Pessoa execute(Pessoa pessoa) {
        return pessoaGateway.createPessoa(pessoa);
    }
}
