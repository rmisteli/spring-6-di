package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.service.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You ar in " + environmentService.getEnv() + " Environment";
    }
}
