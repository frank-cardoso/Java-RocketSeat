//package br.com.frank.gestao_vaga.modules.company.useCases;
//
//import br.com.frank.gestao_vaga.modules.company.dto.AuthCompanyDTO;
//import br.com.frank.gestao_vaga.modules.company.repositories.CompanyRepository;
//import com.auth0.jwt.JWT;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import javax.security.sasl.AuthenticationException;
//
//@Service
//public class AuthCompanyUseCase {
//
//    @Autowired
//    private CompanyRepository companyRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public void execute(AuthCompanyDTO authCompanyDTO) {
//        var company = this.companyRepository.findByUsername(authCompanyDTO.getUsername()).orElseThrow(
//                () ->  {
//                    throw new RuntimeException("Company not found");
//                });
//        var passwordMatches = this.passwordEncoder.matches(authCompanyDTO.getPassword(), company.getPassword());
//
//        if (!passwordMatches) {
//            throw new AuthenticationException("Invalid password");
//        }
//        JWT.create().withIssuer("javagas")
//                .withSubject(company.getById().toString())
//
//
//
//    }
//}
