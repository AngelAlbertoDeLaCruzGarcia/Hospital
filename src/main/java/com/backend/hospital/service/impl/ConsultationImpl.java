package com.backend.hospital.service.impl;

import com.backend.hospital.dto.ConsultationDTO;
import com.backend.hospital.entity.Consultation;
import com.backend.hospital.mapper.ConsultationMapper;
import com.backend.hospital.repository.ConsultationRepository;
import com.backend.hospital.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationImpl implements ConsultationService {

    @Autowired
    ConsultationRepository consultationRepository;

    @Autowired
    ConsultationMapper consultationMapper;

    public void save(ConsultationDTO consultationDTO) {
        Consultation entity = consultationMapper.genreDTOEntity(consultationDTO);
        consultationRepository.save(entity);
    }

    public List<ConsultationDTO> getAllConsultations() {
        List<Consultation> entities = (List<Consultation>) consultationRepository.findAll();
        List<ConsultationDTO> result = consultationMapper.genreDTOEntity2(entities);
        return result;
    }
}
