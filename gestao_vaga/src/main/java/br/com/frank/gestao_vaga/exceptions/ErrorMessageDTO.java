package br.com.frank.gestao_vaga.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessageDTO {

        private String message;
        private String field;
}
