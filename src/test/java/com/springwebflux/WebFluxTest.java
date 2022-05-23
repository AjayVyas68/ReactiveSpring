package com.springwebflux;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class WebFluxTest {
    @Test
    public void monotest()
    {
        Mono<?> monoData=Mono.just("ASV")
                .then(Mono.error(new RuntimeException("Sorry are ")))
                .log();
        monoData.subscribe(System.out::println);
    }
    @Test
    public void fluxTest()
    {
      Flux<String> data=  Flux.just("hello","world","hi")
              .concatWithValues("cloud")
              .concatWith(Flux.error(new RuntimeException("Exception occures")))
              .concatWithValues("caws")
              .log();
        data.subscribe(System.out::println);
    }
}
