package com.mmendoza.soccerApi.controllers;

import com.mmendoza.soccerApi.entities.dto.labels.CreateLabelDto;
import com.mmendoza.soccerApi.entities.dto.labels.LabelDto;
import com.mmendoza.soccerApi.entities.dto.labels.UpdateLabelDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/soccer/labels")
public interface ILabelController {

    @GetMapping
    ResponseEntity<List<LabelDto>> getAllLabels();

    @GetMapping("{labelId}")
    ResponseEntity<LabelDto> getLabelById(@PathVariable Integer labelId);

    @PostMapping
    ResponseEntity<Integer> createdLabel(@RequestBody CreateLabelDto createLabelDto);

    @PutMapping
    ResponseEntity<Integer> updateLabel(@RequestBody UpdateLabelDto updateLabelDto);
}
