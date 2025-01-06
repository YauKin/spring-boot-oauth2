package com.template.core.sample.controller;

import com.template.core.core.constant.ErrorType;
import com.template.core.core.logging.FunctionalException;
import com.template.core.sample.dto.SampleResponseDto;
import com.template.core.sample.service.SampleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    // This method is used to test the SampleService
    @GetMapping("/hello")
    public SampleResponseDto hello() {
        return sampleService.sayHello();
    }

    // This method is used to test the FunctionalException
    @GetMapping("/404")
    public String notFound() {
        throw new FunctionalException(ErrorType.NOT_FOUND, "Not Found");
    }

}
