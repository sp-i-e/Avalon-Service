package com.avalon.service.controller;

import com.avalon.models.requests.AddMovieRequest;
import com.avalon.models.requests.TMDBMovieSearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class MovieController {

    @Autowired
    private WebClient webClient;

    @PostMapping(value="/add/movie",consumes = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_PROTOBUF_VALUE
    })
    public void AddMovie(@RequestBody AddMovieRequest movieRequest){
        System.out.println(movieRequest);
        return;
    }

    @PostMapping
    public void SearchMovie(@RequestBody TMDBMovieSearchRequest movieSearchRequest) {

    }

}
