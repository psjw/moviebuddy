package moviebuddy.data;

import moviebuddy.MovieBuddyFactory;
import moviebuddy.MovieBuddyProfile;
import moviebuddy.domain.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ActiveProfiles(MovieBuddyProfile.XML_MODE)
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {MovieBuddyFactory.class})
public class JaxbMovieReaderTest {
    @Autowired
    JaxbMovieReader movieReader;

    @Test
    void NotEmpty_LoadedMovies(){
//        JaxbMovieReader movieReader = new JaxbMovieReader();
        List<Movie> movies = movieReader.loadMovies();
        //movies.size() //XML 문서에 등록된 영화 수와 동일한가?
//        MovieFinderTest.assertEquals(1375, movies.size());
        Assertions.assertEquals(1375, movies.size());
    }
}
