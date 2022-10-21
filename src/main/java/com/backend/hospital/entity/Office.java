package com.backend.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "offices")
public class Office implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "office_number")
    private int officeNumber;

    @Column(name = "flat")
    private int flat;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    @Column(name = "update_at", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date updateAt;

    @Column(name = "delete_at", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date deleteAt;

    public Office() { }

    public Office(int officeNumber, int flat, Date createAt, Date updateAt, Date deleteAt) {
        this.officeNumber = officeNumber;
        this.flat = flat;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.deleteAt = deleteAt;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
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