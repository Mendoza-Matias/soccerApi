package com.mmendoza.soccerApi.entities.dto.labels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CreateLabelDto {

    @JsonProperty("description")
    private String description;

}
