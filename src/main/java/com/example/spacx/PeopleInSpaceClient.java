package com.example.spacx;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "peopleInSpaceClient", url = "http://api.open-notify.org")
public interface PeopleInSpaceClient {

    @GetMapping("/astros.json")
    PeopleInSpaceResponse getPeopleInSpace();
}
