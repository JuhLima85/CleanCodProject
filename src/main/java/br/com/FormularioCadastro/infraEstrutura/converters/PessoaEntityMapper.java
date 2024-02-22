package br.com.FormularioCadastro.infraEstrutura.converters;

import br.com.FormularioCadastro.core.domain.Pessoa;
import br.com.FormularioCadastro.infraEstrutura.persistence.PessoaEntity;
import org.springframework.stereotype.Component;

@Component
public class PessoaEntityMapper {

    public PessoaEntity DomaintoEntity(Pessoa pessoa){
        PessoaEntity pessoaEntity = new PessoaEntity();
       // pessoaEntity.setId(""); // Definindo o ID como nulo para que o framework JPA possa gerar automaticamente
        pessoaEntity.setNome(pessoa.nome());
        pessoaEntity.setEmail(pessoa.email());
        pessoaEntity.setCpfCnpj(pessoa.cpfCnj());
        pessoaEntity.setTipo(pessoa.tipo());
        return pessoaEntity;
    }

    public Pessoa EntityToDomain(PessoaEntity entity){
        return new Pessoa(entity.getId(), entity.getNome(), entity.getEmail(), entity.getCpfCnpj(), entity.getTipo());
    }
}
