package br.com.FormularioCadastro.infraEstrutura.controllers;

import br.com.FormularioCadastro.core.domain.Pessoa;
import br.com.FormularioCadastro.core.useCases.CreatePessoaUseCase;
import br.com.FormularioCadastro.infraEstrutura.converters.PessoaDTOMapper;
import br.com.FormularioCadastro.infraEstrutura.dtos.PessoaDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final PessoaDTOMapper mapper;

    @PostMapping
    public PessoaDTO createPessoa(@RequestBody PessoaDTO pessoaDTO){
     Pessoa pessoa = createPessoaUseCase.execute(mapper.toDomain(pessoaDTO));
     return mapper.toDTO(pessoa);
    }
}
