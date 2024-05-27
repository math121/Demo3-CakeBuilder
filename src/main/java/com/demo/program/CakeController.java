package com.demo.program;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class CakeController {

    private CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @GetMapping("customCake")
    public String getCustomCake() {
        return cakeService.getCustomCake("Red velvet").toString();
    }

    @GetMapping("chocoCake")
    public Cake getChocolateCake() {
        return cakeService.getChocolateCake();
    }

    @GetMapping("vanillaCake")
    public Cake getVanillaCake() {
        return cakeService.getVanillaCake();
    }
}
