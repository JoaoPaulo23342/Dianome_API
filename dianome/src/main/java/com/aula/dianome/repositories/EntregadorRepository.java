package com.aula.dianome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.dianome.models.EntregadorModel;

@Repository
public interface EntregadorRepository extends JpaRepository<EntregadorModel, Integer>{
	
	

}
