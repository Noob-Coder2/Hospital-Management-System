package cg.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TrainedInId implements Serializable {

    @Column(name = "Physician", nullable = false)
    private Integer physician;

    @Column(name = "Treatment", nullable = false)
    private Integer treatment;

    public Integer getPhysician() { return physician; }
    public void setPhysician(Integer p) { this.physician = p; }
    public Integer getTreatment() { return treatment; }
    public void setTreatment(Integer t) { this.treatment = t; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrainedInId that = (TrainedInId) o;
        return Objects.equals(physician, that.physician) &&
               Objects.equals(treatment, that.treatment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physician, treatment);
    }

    @Override
    public String toString() {
        return physician + "_" + treatment;
    }
}