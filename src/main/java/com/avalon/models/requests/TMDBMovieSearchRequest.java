package com.avalon.models.requests;

import lombok.Data;

@Data
public class TMDBMovieSearchRequest {
    String query;
    boolean include_adult;
    String language;
    String primary_release_year;
    int page;
    String region;
    String year;
}
