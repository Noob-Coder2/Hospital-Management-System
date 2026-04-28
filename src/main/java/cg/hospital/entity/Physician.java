package cg.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Physician")
public class Physician {

    @Id
    @Column(name = "EmployeeID")
    private Integer employeeId;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Position", nullable = false)
    private String position;

    @Column(name = "SSN", nullable = false)
    private Integer ssn;

<<<<<<< HEAD
=======

>>>>>>> cfbfe4c (Resolved conflict - accepted master version)
    public Integer getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public Integer getSsn() { return ssn; }

<<<<<<< HEAD
=======

>>>>>>> cfbfe4c (Resolved conflict - accepted master version)
    public void setEmployeeId(Integer employeeId) { 
        this.employeeId = employeeId; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public void setPosition(String position) { 
        this.position = position; 
    }
    public void setSsn(Integer ssn) { 
        this.ssn = ssn; 
    }
}