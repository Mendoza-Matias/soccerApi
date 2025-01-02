package com.mmendoza.soccerApi.services.labels;

import com.mmendoza.soccerApi.entities.Label;
import com.mmendoza.soccerApi.entities.exceptions.PropertyException;
import com.mmendoza.soccerApi.repository.ILabelRepository;
import com.mmendoza.soccerApi.services.GenericService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceCreateLabel extends GenericService<String, Integer> {

    @Autowired
    private ILabelRepository labelRepository;

    @Override
    public Integer service(String request) {

        if (StringUtils.isEmpty(request))
            throw new PropertyException("description is empty");


        Label label = labelRepository.save(Label.builder().description(request).build());

        return label.getLabelId(); /* return id */
    }
}
