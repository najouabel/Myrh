package com.app.myrhh.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.app.myrhh.utils.Enum;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "title", nullable = false)
    private String title;

    @Basic
    @Column(name = "description", nullable = false)
    private String description;

    @Basic
    @Column(name = "location", nullable = false)
    private String location;

    @Basic
    @Column(name = "degree", nullable = false)
    private String degree;

    @Basic
    @Column(name = "salary")
    private Double salary;

    @Basic
    @Column(name = "status", nullable = false)
    private String status;

    @Basic
    @Column(name = "profile", nullable = false)
    private String profile;

    @Basic
    @Column(name = "company_id")
    private Long companyId;

    @ManyToOne
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    private Company company;

    @Basic
    @Column
    private Date created;

    @Basic
    @Column
    private Date updated;

    @PrePersist
    protected void onCreate(){
        this.created = new Date();
        this.updated = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated = new Date();
    }



    public Offer(String title, String description, String location, String degree, Double salary,  String profile, Long companyId) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.degree = degree;
        this.salary = salary;
        this.profile = profile;
        this.companyId = companyId;
        this.status = Enum.status.Pending.toString(); }

}
