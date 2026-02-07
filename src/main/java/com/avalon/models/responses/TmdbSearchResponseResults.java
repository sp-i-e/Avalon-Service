package com.avalon.models.responses;

import lombok.Data;

@Data
public class TmdbSearchResponseResults {
    Boolean adult;
    String backdrop_path;
    Integer[] genre_ids;
    Integer id;
    String original_language;
    String original_title;
    String overview;
    Double popularity;
    String poster_path;
    String release_date;
    String title;
    Boolean video;
    Double vote_average;
    Integer vote_count;
}
