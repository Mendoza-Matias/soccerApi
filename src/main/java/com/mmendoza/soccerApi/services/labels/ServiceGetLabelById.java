package com.mmendoza.soccerApi.services.labels;

import com.mmendoza.soccerApi.entities.Label;
import com.mmendoza.soccerApi.entities.exceptions.NotFoundException;
import com.mmendoza.soccerApi.entities.exceptions.PropertyException;
import com.mmendoza.soccerApi.repository.ILabelRepository;
import com.mmendoza.soccerApi.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ServiceGetLabelById extends GenericService<Integer, Label> {

    @Autowired
    private ILabelRepository labelRepository;

    @Override
    public Label service(Integer request) {

        if (request == null)
            throw new PropertyException("the id is null");

        return labelRepository.findById(request)
                .orElseThrow(() -> new NotFoundException("Label not found"));
    }
}
