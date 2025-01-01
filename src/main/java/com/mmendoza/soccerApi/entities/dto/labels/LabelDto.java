package com.mmendoza.soccerApi.entities.dto.labels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LabelDto {

    @JsonProperty("label_id")
    private Integer labelId;

    @JsonProperty("description")
    private String description;
}
