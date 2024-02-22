package br.com.FormularioCadastro.infraEstrutura.configuration;

import br.com.FormularioCadastro.core.gateways.PessoaGateway;
import br.com.FormularioCadastro.core.useCases.CreatePessoaUseCase;
import br.com.FormularioCadastro.core.useCases.CreatePessoaUseCaseImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePessoaUseCase createPessoaUseCase(PessoaGateway pessoaGateway){
        return new CreatePessoaUseCaseImp(pessoaGateway);
    }
}
