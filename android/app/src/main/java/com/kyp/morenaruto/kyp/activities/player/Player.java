package com.kyp.morenaruto.kyp.activities.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Player {
    private Long id;

    private String name;

    private Double height;

    private String position;
}
