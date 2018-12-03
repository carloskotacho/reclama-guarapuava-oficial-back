package br.edu.utfpr.reclamaguarapuava.model.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ProblemDTO {
    @NotNull
    private Long id;

    @NotEmpty(message = "O nome não pode ser vazio")
    @Length(min = 2, max = 100, message = "O nome do problema deve conter no mínimo 2 e máximo 100 caracteres.")
    private String name;

    @NotNull
    private String description;

    @NotNull
    private Long categoryId;
}
