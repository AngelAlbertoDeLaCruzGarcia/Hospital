package com.backend.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "consultations")
public class Consultation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "consultation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date consultationDate;

    @Column(name = "patient_name", length = 200)
    private String patientName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Doctor doctor;

    @Column(name = "doctor_id")
    private int doctorId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "office_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Office office;

    @Column(name = "office_id")
    private int officeId;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @Column(name = "update_at", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date updateAt;

    @Column(name = "delete_at", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date deleteAt;

    public Consultation() { }

    public Consultation(Date consultationDate, String patientName, int doctorId, int officeId, Date createAt, Date updateAt, Date deleteAt) {
        this.consultationDate = consultationDate;
        this.patientName = patientName;
        this.doctorId = doctorId;
        this.officeId = officeId;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.deleteAt = deleteAt;
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

    private static final long serialVersionUID = 1L;
}