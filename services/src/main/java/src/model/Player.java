package src.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder(builderClassName = "PlayerBuilder")
@AllArgsConstructor
@Data
public class Player {
    private Long id;
    private String name;
    private String position;
    private Double height;
}
