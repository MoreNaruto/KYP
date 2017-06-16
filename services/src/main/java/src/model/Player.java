package src.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getHeight() {
        return height;
    }

    public String getPosition() {
        return position;
    }

    public static class PlayerBuilder {
        private Long id;
        private String name;
        private Double height;
        private String position;

        public PlayerBuilder() {
        }

        public PlayerBuilder setId(Long id){
            this.id = id;
            return this;
        }

        public PlayerBuilder setName(String name){
            this.name = name;
            return this;
        }

        public PlayerBuilder setHeight(Double height){
            this.height = height;
            return this;
        }

        public PlayerBuilder setPosition(String position){
            this.position = position;
            return this;
        }

        public Player build(){
            return new Player(id, name, height, position);
        }
    }
}
