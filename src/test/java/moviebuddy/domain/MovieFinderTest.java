package moviebuddy.domain;

import moviebuddy.MovieBuddyFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @author springrunner.kr@gmail.com
 */
@SpringJUnitConfig(MovieBuddyFactory.class)
//@ExtendWith(SpringExtension.class) //JUnit이 테스트 실행전략을 확장할때 사용 // SpringExtension에서 제공하는 스프링 컨테이너 제공 관리
//@ContextConfiguration(classes = MovieBuddyFactory.class) //해당 Annotation이 지정한 스프링 구성정보를 바탕으로 실행
public class MovieFinderTest {
//	final MovieFinder movieFinder;
//	@Autowired
//	public MovieFinderTest(MovieFinder movieFinder) {
//		this.movieFinder = movieFinder;
//	}

	@Autowired
	MovieFinder movieFinder;

//	MovieFinder movieFinder;
//	@Autowired
//	public void setMovieFinder(MovieFinder movieFinder) {
//		this.movieFinder = movieFinder;
//	}

	@Test
	void NotEmpty_directedBy(){
		List<Movie> movies = movieFinder.directedBy("Michael Bay");
		Assertions.assertEquals(3, movies.size());
	}

	@Test
	void NotEmpty_ReleasedBy(){
		List<Movie> movies = movieFinder.releasedYearBy(2015);
		Assertions.assertEquals(225, movies.size());
	}

	
}
