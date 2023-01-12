
package moviebuddy.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * packageName : moviebuddy.domain
 * fileName : JaxbMovieReaderTest
 * author : psjw
 */
public class JaxbMovieReaderTest {

    @Test
    void NotEmpty_LoadedMovies() {
        JaxbMovieReader movieReader = new JaxbMovieReader();

        List<Movie> movies = movieReader.loadMovies();
//        movies.size() =>> XML 문서의 영화수와 동일한가?
        Assertions.assertEquals(1375, movies.size());
    }
}