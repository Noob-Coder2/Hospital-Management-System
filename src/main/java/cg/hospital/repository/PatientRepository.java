package cg.hospital.repository;

import cg.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

// Spring Data REST auto-exposes — NO controller needed:
// GET    /api/patients
// GET    /api/patients/{ssn}
// POST   /api/patients
// PUT    /api/patients/{ssn}
// PATCH  /api/patients/{ssn}

@RepositoryRestResource(collectionResourceRel = "patients", path = "patients")
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    // Exposed at: GET /api/patients/search/findByPcpEmployeeId?employeeId=1
    List<Patient> findByPcp_EmployeeId(Integer employeeId);

}