package cg.hospital.repository;

import cg.hospital.entity.TrainedIn;
import cg.hospital.entity.TrainedInId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(
    collectionResourceRel = "trainedIn",
    path = "trained-in"
)
public interface TrainedInRepository
    extends JpaRepository<TrainedIn, TrainedInId> {

    List<TrainedIn> findByIdPhysician(
        @Param("physician") Integer physician
    );

    List<TrainedIn> findByIdTreatment(
        @Param("treatment") Integer treatment
    );
}