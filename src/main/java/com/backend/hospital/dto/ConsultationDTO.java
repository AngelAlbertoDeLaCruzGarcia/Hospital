package com.backend.hospital.dto;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

public class ConsultationDTO {

    private int id;

    private Date consultationDate;

    @NotEmpty
    private String patientName;

    @Positive
    private int doctorId;

    @Positive
    private int officeId;

    private Date createAt = new Date();

    private Date updateAt;

    private Date deleteAt;

    public ConsultationDTO() { }

    public ConsultationDTO(int id, Date consultationDate, String patientName, int doctorId, int officeId, Date createAt, Date updateAt, Date deleteAt) {
        this.id = id;
        this.consultationDate = consultationDate;
        this.patientName = patientName;
        this.doctorId = doctorId;
        this.officeId = officeId;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.deleteAt = deleteAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Date getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(Date deleteAt) {
        this.deleteAt = deleteAt;
    }

}