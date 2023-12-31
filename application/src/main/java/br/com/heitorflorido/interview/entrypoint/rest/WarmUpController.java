package br.com.heitorflorido.interview.entrypoint.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class WarmUpController {

    @GetMapping("/_ah/warmup")
    public Mono<Void> warmup() {
        return Mono.empty();
    }
}
