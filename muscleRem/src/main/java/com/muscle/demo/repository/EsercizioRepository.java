package com.muscle.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.muscle.demo.model.Esercizio;

public interface EsercizioRepository extends CrudRepository<Esercizio, Long> {

}
