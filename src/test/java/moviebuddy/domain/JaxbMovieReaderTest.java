package moviebuddy.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JaxbMovieReaderTest {


    @Test
    void NotEmpty_LoadedMovies(){
        JaxbMovieReader movieReader = new JaxbMovieReader();
        List<Movie> movies = movieReader.loadMovies();
        //movies.size() //XML 문서에 등록된 영화 수와 동일한가?
//        MovieFinderTest.assertEquals(1375, movies.size());
        Assertions.assertEquals(1375, movies.size());
    }
}
