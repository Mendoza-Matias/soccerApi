package com.mmendoza.soccerApi.entities.dto.labels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class UpdateLabelDto {

    @JsonProperty("label_id")
    private Integer labelId;

    @JsonProperty("description")
    private String description;
}
