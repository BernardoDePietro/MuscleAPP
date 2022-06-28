package com.muscle.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.muscle.demo.model.Admin;

public interface AdminRepository  extends CrudRepository<Admin, Long> {

}
