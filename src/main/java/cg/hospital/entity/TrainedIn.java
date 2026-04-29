package cg.hospital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Trained_In")
public class TrainedIn {

    @EmbeddedId
    private TrainedInId id;

    @Column(name = "CertificationDate", nullable = false)
    private LocalDateTime certificationDate;

    @Column(name = "CertificationExpires", nullable = false)
    private LocalDateTime certificationExpires;

    public TrainedInId getId() { return id; }
    public void setId(TrainedInId id) { this.id = id; }

    public LocalDateTime getCertificationDate() {
        return certificationDate;
    }
    public void setCertificationDate(LocalDateTime d) {
        this.certificationDate = d;
    }

    public LocalDateTime getCertificationExpires() {
        return certificationExpires;
    }
    public void setCertificationExpires(LocalDateTime d) {
        this.certificationExpires = d;
    }
}