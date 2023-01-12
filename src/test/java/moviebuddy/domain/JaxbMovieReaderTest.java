package moviebuddy.domain;

import java.util.List;

/**
 * packageName : moviebuddy.domain
 * fileName : JaxbMovieReaderTest
 * author : psjw
 */
public class JaxbMovieReaderTest {

    void NotEmpty_LoadedMovies() {
        JaxbMovieReader movieReader = new JaxbMovieReader();

        List<Movie> movies = movieReader.loadMovies();
//        movies.size() =>> XML 문서의 영화수와 동일한가?
        MovieFinderTest.assertEquals(1375, movies.size());
    }
}
