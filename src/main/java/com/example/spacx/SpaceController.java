package com.example.spacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
public class SpaceController {
    @Autowired
    private SpaceService spaceService;

    @GetMapping("/feign")
    public String getPeopleInSpaceUsingFeign() {
        return spaceService.getPeopleInSpaceUsingFeign();
    }

    @GetMapping("/webclient")
    public String getPeopleInSpaceUsingWebClient() {
        return spaceService.getPeopleInSpaceUsingWebClient().block();
    }
}
