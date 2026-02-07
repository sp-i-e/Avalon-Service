package com.avalon.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TMDBSearchMovieResponse {
    Integer page;
    @JsonProperty("results")
    TmdbSearchResponseResults results;
    Integer total_pages;
    Integer total_results;
}
