package src.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@Entity
@Table(name = "player")
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLYR_SEQ")
    @SequenceGenerator(sequenceName = "player_sequence", allocationSize = 1, name = "PLYR_SEQ")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "height")
    private Double height;

    @Column(name = "position")
    private String position;
}
