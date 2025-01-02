package com.mmendoza.soccerApi.services.labels;

import com.mmendoza.soccerApi.entities.Label;
import com.mmendoza.soccerApi.entities.exceptions.NotFoundException;
import com.mmendoza.soccerApi.repository.ILabelRepository;
import com.mmendoza.soccerApi.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServiceGetAllLabels extends GenericService<Void, List<Label>> {

    @Autowired
    private ILabelRepository labelRepository;

    @Override
    public List<Label> service(Void request) {

        List<Label> labels = labelRepository.findAll();

        if (labels.isEmpty())
            throw new NotFoundException("no labels");

        return labels;
    }
}
