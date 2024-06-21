package com.example.spacx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PeopleInSpaceService {

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<PeopleInSpaceResponse> getPeopleInSpace() {
        return webClientBuilder.build()
                .get()
                .uri("http://api.open-notify.org/astros.json")
                .retrieve()
                .bodyToMono(PeopleInSpaceResponse.class);
    }
}
