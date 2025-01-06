package com.template.core.sample.controller;

import com.template.core.sample.dto.SampleResponseDto;
import com.template.core.sample.service.SampleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("/hello")
    public SampleResponseDto hello() {
        return sampleService.sayHello();
    }

}
