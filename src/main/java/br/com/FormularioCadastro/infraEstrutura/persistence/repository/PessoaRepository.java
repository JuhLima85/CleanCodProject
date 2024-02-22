package br.com.FormularioCadastro.infraEstrutura.persistence.repository;

import br.com.FormularioCadastro.infraEstrutura.persistence.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
