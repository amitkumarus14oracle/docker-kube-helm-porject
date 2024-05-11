package com.example.dockerkubetestproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeController {
    @GetMapping("/kube/test")
    public String test() {
        return "Message from Kube Controller";
    }
}
