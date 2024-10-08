package br.com.frank.gestao_vaga.modules.candidate.useCases;

import br.com.frank.gestao_vaga.modules.candidate.CandidateEntity;
import br.com.frank.gestao_vaga.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProfileCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID idCandidate) {
            var candidate = this.candidateRepository.findById(idCandidate)
                    .orElseThrow(() -> {
                        throw new UsernameNotFoundException("User not found");
                    });
            var candidateDTO = ProfileCandidateResponseDTO.builder()
                    .description(candidate.getDescription())
                    .email(candidate.getEmail())
                    .id(candidate.getId())
                    .name(candidate.getName())
                    .username(candidate.getUsername())
                    .build();
            return candidateDTO;
    }
}
