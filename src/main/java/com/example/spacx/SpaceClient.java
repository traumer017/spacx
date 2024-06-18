package com.example.spacx;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "OpenNotify", url = "http://open-notify.org/Open-Notify-API/People-In-Space/")
public interface SpaceClient {
    @GetMapping("/astros.json")
    String getPeopleInSpace();
}
