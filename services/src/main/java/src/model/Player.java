package src.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PLYR_SEQ")
    @SequenceGenerator(sequenceName = "player_sequence", allocationSize = 1, name = "PLYR_SEQ")
    private Long id;

    private String name;

    private String position;

    private Double height;
}
