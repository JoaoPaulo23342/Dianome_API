package com.aula.dianome.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EntregadorDto (
	
	@NotBlank String cpf,
	@NotBlank String nome,
	@NotNull Integer capacidade
	) { } 
