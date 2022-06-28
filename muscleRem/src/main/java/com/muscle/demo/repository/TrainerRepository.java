package com.muscle.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.muscle.demo.model.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Long> {

}
