package com.example.spacx;

import com.example.spacx.PeopleInSpaceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class SpaceController {

    @Autowired
    private PeopleInSpaceClient peopleInSpaceClient;

    @Autowired
    private PeopleInSpaceService peopleInSpaceService;

    @GetMapping("/feign")
    public PeopleInSpaceResponse getPeopleInSpaceFeign() {
        return peopleInSpaceClient.getPeopleInSpace();
    }


    @GetMapping("/webclient")
    public Mono<PeopleInSpaceResponse> getPeopleInSpaceWebClient() {
        return peopleInSpaceService.getPeopleInSpace();
    }
}
