package com.alfa.gif_service.controller;

import com.alfa.gif_service.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping(value = "/status")
    public ResponseEntity<String> getServiceStatus() {
        return ResponseEntity.ok("ok");
    }

    @GetMapping(value = "/info/{currencyName}", produces = MediaType.IMAGE_GIF_VALUE)
    public ResponseEntity<byte[]> getGif(@PathVariable String currencyName) {
        return ResponseEntity.ok(mainService.getStatusAccountByCurrencyName(currencyName));
    }
}
