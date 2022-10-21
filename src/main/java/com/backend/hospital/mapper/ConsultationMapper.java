package com.backend.hospital.mapper;

import com.backend.hospital.dto.ConsultationDTO;
import com.backend.hospital.entity.Consultation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConsultationMapper {

    public Consultation genreDTOEntity(ConsultationDTO consultationDTO) {
        Consultation consultation = new Consultation();
        consultation.setPatientName(consultationDTO.getPatientName());
        consultation.setDoctorId(consultationDTO.getDoctorId());
        consultation.setOfficeId(consultationDTO.getOfficeId());
        consultation.setConsultationDate(consultationDTO.getConsultationDate());
        return consultation;
    }
    public ConsultationDTO genreEntityDTO(Consultation entity) {
        ConsultationDTO consultationDTO = new ConsultationDTO();
        consultationDTO.setPatientName(entity.getPatientName());
        consultationDTO.setDoctorId(entity.getDoctorId());
        consultationDTO.setOfficeId(entity.getOfficeId());
        consultationDTO.setConsultationDate(entity.getConsultationDate());
        return consultationDTO;
    }
    public List<ConsultationDTO> genreDTOEntity2(List<Consultation> entities) {
        List<ConsultationDTO> dtos = new ArrayList<>();
        for (Consultation entity : entities){
            dtos.add(genreEntityDTO(entity));
        }
        return dtos;
    }
}
