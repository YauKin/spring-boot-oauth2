package com.template.core.sample.service;

import com.template.core.sample.dto.SampleResponseDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ExtendWith(MockitoExtension.class)
class SampleServiceTest {


    private SampleServiceImpl sampleService;

    @BeforeEach
    void setup() {
        sampleService = new SampleServiceImpl();
    }

    @Test
    void testSayHello() {
        assertThat(sampleService.sayHello()).isEqualTo(new SampleResponseDto("Hello World!"));
    }

}
