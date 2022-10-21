package com.backend.hospital.repository;

import com.backend.hospital.entity.Consultation;
import org.springframework.data.repository.CrudRepository;

public interface ConsultationRepository extends CrudRepository<Consultation,Integer>{
	
}
