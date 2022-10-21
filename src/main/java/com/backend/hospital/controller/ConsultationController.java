package com.backend.hospital.controller;


import com.backend.hospital.dto.ConsultationDTO;
import com.backend.hospital.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ConsultationController {

    @Autowired
    ConsultationService consultationService;

    @GetMapping("/consultation")
    public ResponseEntity<?> getAll() {
        List<ConsultationDTO> genres = consultationService.getAllConsultations();
        return new ResponseEntity(genres, HttpStatus.OK);
    }

    @PostMapping(value = "/consultation")
    public ResponseEntity<?> saveGenre(@Valid @RequestBody ConsultationDTO consultationDTO, Errors errores) {
        try {
            if (errores.hasErrors()) {
                return new ResponseEntity(errores.getFieldErrors(), HttpStatus.BAD_REQUEST);
            }
            consultationService.save(consultationDTO);
            return new ResponseEntity("Registrado", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.BAD_REQUEST);
        }
    }
}