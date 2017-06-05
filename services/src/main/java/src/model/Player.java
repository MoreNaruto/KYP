package src.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@Entity
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLYR_SEQ")
    @SequenceGenerator(sequenceName = "player_sequence", allocationSize = 1, name = "PLYR_SEQ")
    private Long id;

    private String name;

    private String position;

    private Double height;
}
