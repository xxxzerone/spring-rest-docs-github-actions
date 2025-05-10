package com.example.demo.api.logger;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class LoggerController {

    private final LoggerService loggerService;

    @GetMapping("/logger")
    public String logger() {
        log.info("[LoggerController] logger");
        loggerService.logger();
        return "Hello, Logger!";
    }
}
