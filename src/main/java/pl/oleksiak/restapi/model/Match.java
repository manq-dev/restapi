package pl.oleksiak.restapi.model;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@ApiModel(description = "${match.description}")
public class Match {

    @Id
    private long id;
    private long player1_id;
    private long player2_id;
    private String score;
    private LocalDateTime date;

}
