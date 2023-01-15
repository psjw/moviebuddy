package moviebuddy;

import moviebuddy.domain.CsvMovieReader;
import moviebuddy.domain.MovieFinder;

/**
 * packageName : moviebuddy
 * fileName : MovieBuddyFactory
 * author : psjw
 */
public class MovieBuddyFactory {
    public MovieFinder movieFinder(){
        return new MovieFinder(new CsvMovieReader());
    }
}
