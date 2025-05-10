package com.example.demo.api.logger;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoggerService {

//    Logger log = LoggerFactory.getLogger(LoggerService.class);

    public void logger() {
        log.trace("trace: {}", "!!trace");
        log.debug("debug: {}", "@@debug");
        log.info("info: {}", "##info");
        log.warn("warn: {}", "$$warn");
        log.error("error: {}", "%%error");
    }
}
