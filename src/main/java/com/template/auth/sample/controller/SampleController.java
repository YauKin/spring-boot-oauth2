package com.template.auth.sample.controller;

import com.template.auth.core.constant.ErrorType;
import com.template.auth.core.logging.FunctionalException;
import com.template.auth.sample.dto.SampleResponseDto;
import com.template.auth.sample.service.SampleService;
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
