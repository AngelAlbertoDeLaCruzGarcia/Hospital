package com.backend.hospital.service;

import com.backend.hospital.dto.ConsultationDTO;

import java.util.List;

public interface ConsultationService {
    void save(ConsultationDTO consultationDTO);

    List<ConsultationDTO> getAllConsultations();


}
