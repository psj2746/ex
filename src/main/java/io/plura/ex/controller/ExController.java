package io.plura.ex.controller;

import io.plura.ex.dto.ExDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex")
public class ExController {
    @GetMapping("/hello")
    public ExDto hello() {
        return new ExDto(0, "ex> ok #1");
    }

    @GetMapping("/nop")
    public void hi() {
        System.out.println("nop~");
    }
}
