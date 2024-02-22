package br.com.FormularioCadastro.infraEstrutura.converters;

import br.com.FormularioCadastro.core.domain.Pessoa;
import br.com.FormularioCadastro.infraEstrutura.dtos.PessoaDTO;
import org.springframework.stereotype.Component;

@Component
public class PessoaDTOMapper {
	public PessoaDTO toDTO(Pessoa pessoa) {
		return new PessoaDTO(pessoa.nome(), pessoa.email(), pessoa.cpfCnj(), pessoa.tipo());
	}

	public Pessoa toDomain(PessoaDTO pessoaDTO) {
		return new Pessoa(null, pessoaDTO.nome(), pessoaDTO.email(), pessoaDTO.cpfCnj(), pessoaDTO.tipo());
	}
}
