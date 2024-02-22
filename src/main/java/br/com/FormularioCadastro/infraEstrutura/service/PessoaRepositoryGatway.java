package br.com.FormularioCadastro.infraEstrutura.service;

import br.com.FormularioCadastro.core.domain.Pessoa;
import br.com.FormularioCadastro.core.gateways.PessoaGateway;
import br.com.FormularioCadastro.infraEstrutura.converters.PessoaEntityMapper;
import br.com.FormularioCadastro.infraEstrutura.persistence.PessoaEntity;
import br.com.FormularioCadastro.infraEstrutura.persistence.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryGatway implements PessoaGateway {

    private final PessoaRepository repository;
    private final PessoaEntityMapper entityMapper;

    @Override
    public Pessoa createPessoa(Pessoa pessoa) {
     PessoaEntity entity = entityMapper.DomaintoEntity(pessoa);
     PessoaEntity novaPessoa = repository.save(entity);
         return entityMapper.EntityToDomain(novaPessoa);
    }
}
