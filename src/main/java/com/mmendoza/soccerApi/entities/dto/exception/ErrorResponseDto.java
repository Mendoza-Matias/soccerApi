package com.mmendoza.soccerApi.entities.dto.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class ErrorResponseDto {

    @JsonProperty("message")
    private String message;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime timestamp;
}
