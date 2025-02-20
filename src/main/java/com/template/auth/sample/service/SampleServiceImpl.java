package com.template.auth.sample.service;

import com.template.auth.sample.dto.SampleResponseDto;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public SampleResponseDto sayHello() {
        SampleResponseDto response = new SampleResponseDto();
        response.setMessage("Hello World!");
        return response;
    }
}
