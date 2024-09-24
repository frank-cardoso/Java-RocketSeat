package br.com.frank.gestao_vaga.modules.company.useCases;

import br.com.frank.gestao_vaga.modules.company.entities.JobEntity;
import br.com.frank.gestao_vaga.modules.company.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }

}
