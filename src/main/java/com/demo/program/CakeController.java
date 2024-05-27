package com.demo.program;

import com.demo.program.cake_builder.Cake;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class CakeController {

    private final BasicErrorController basicErrorController;
    private CakeService cakeService;

    public CakeController(CakeService cakeService, BasicErrorController basicErrorController) {
        this.cakeService = cakeService;
        this.basicErrorController = basicErrorController;
    }

    @GetMapping("customCake/{flavour}/{size}/{layers}")
    public String getCustomCake(@PathVariable String flavour,
                                @PathVariable String size,
                                @PathVariable int layers) {
        //default
        CakeSize cakeSize = switch (size.toLowerCase()) {
            case "large" -> CakeSize.LARGE;
            case "small" -> CakeSize.SMALL;
            default -> CakeSize.MEDIUM;
        };

        return cakeService.getCustomCake(flavour, cakeSize, layers).toString();
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
