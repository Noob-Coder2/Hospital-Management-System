package cg.hospital.projection;

import org.springframework.data.rest.core.config.Projection;
import cg.hospital.entity.TrainedIn;
import cg.hospital.entity.TrainedInId;
import java.time.LocalDateTime;

@Projection(
    name = "trainedInView",
    types = { TrainedIn.class }
)
public interface TrainedInView {

    TrainedInId getId();
    LocalDateTime getCertificationDate();
    LocalDateTime getCertificationExpires();
}