package com.jh.halterocmscore.serviceImpl;

import com.jh.halterocmscore.model.ExampleDTO;
import com.jh.halterocmscore.service.ExampleService;
import org.springframework.stereotype.Service;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {

    @Override
    public ExampleDTO getExampleDTO() {
        return new ExampleDTO("Jellous");
    }
}
