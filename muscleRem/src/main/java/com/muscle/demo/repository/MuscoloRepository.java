package com.muscle.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.muscle.demo.model.Muscolo;

public interface MuscoloRepository extends CrudRepository<Muscolo, Long> {

}
