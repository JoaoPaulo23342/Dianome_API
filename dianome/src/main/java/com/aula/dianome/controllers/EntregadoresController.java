package com.aula.dianome.controllers;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aula.dianome.dtos.EntregadorDto;
import com.aula.dianome.models.EntregadorModel;
import com.aula.dianome.repositories.EntregadorRepository;

import jakarta.validation.Valid;

@RestController
public class EntregadoresController {

	@Autowired
	EntregadorRepository entregadorRepository;

	@GetMapping("/entregadores")
	public ResponseEntity<List<EntregadorModel>> listar() {
		List<EntregadorModel> listaEntregadores = entregadorRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(listaEntregadores);
	}

	@PostMapping("/entregadores")
	public ResponseEntity<EntregadorModel> salvar(@RequestBody @Valid EntregadorDto dto) {
		var entregadorModel = new EntregadorModel(); 
		BeanUtils.copyProperties(dto, entregadorModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(entregadorRepository.save(entregadorModel));
	}


	@GetMapping("/entregadores/{id}")
	public ResponseEntity<Object> detalhar (@PathVariable(value="id")Integer id){
		Optional<EntregadorModel> entregadores = entregadorRepository.findById(id);
		if(entregadores.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("entregador não Encontrado");
		}
		return ResponseEntity.status(HttpStatus.OK).body(entregadores.get());
	}
	@PutMapping("/entregadores/{id}")
    public ResponseEntity<Object> atualizarEntregador(@PathVariable(value="id") Integer id, @RequestBody @Valid EntregadorDto dto){
        Optional<EntregadorModel> entregador = entregadorRepository.findById(id);
        if(entregador.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entregador não encontrado!");
        }
        var entregadorModel = entregador.get();
        BeanUtils.copyProperties(dto, entregadorModel);
        return ResponseEntity.status(HttpStatus.OK).body(entregadorRepository.save(entregadorModel));
    }
	@DeleteMapping("/entregadores/{id}")
	public ResponseEntity<Object> excluirEntregador(@PathVariable(value="id") Integer id) {
		Optional<EntregadorModel> entregadores = entregadorRepository.findById(id);
		if (entregadores.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Entregador não Encontrado");
		}
		entregadorRepository.delete(entregadores.get());
		return ResponseEntity.status(HttpStatus.OK).body("O Entregador foi excluido");
	}
}