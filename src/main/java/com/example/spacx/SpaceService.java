package com.example.spacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class SpaceService {
    @Autowired
    private SpaceClient spaceClient;

    @Autowired
    private WebClient webClient;

    public String getPeopleInSpaceUsingFeign() {
        return spaceClient.getPeopleInSpace();
    }

    public Mono<String> getPeopleInSpaceUsingWebClient() {
        return webClient.get()
                .uri("http://api.open-notify.org/astros.json")
                .retrieve()
                .bodyToMono(String.class);
    }
}
