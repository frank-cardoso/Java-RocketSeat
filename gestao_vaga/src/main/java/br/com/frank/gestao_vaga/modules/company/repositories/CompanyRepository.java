package br.com.frank.gestao_vaga.modules.company.repositories;

import br.com.frank.gestao_vaga.modules.company.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepository  extends JpaRepository<CompanyEntity, UUID> {
    Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
    Optional<CompanyRepository> findByUsername(String username);
}
