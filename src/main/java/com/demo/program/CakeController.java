package com.demo.program;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class CakeController {

    private CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @GetMapping("customCake")
    public String getCustomCake(@RequestParam String flavour) {
        return cakeService.getCustomCake(flavour).toString();
    }

    @GetMapping("randomCake")
    public String getRandomCake() {
        return cakeService.getRandomCake().toString();
    }

    @GetMapping("chocoCake")
    public String getChocolateCake() {
        return cakeService.getChocolateCake().toString();
    }

    @GetMapping("vanillaCake")
    public String getVanillaCake() {
        return cakeService.getVanillaCake().toString();
    }
}
