package com.backend.hospital.repository;

import com.backend.hospital.entity.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<Doctor,Integer>{
	
}
