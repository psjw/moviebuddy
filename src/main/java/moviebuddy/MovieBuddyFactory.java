package moviebuddy;

import moviebuddy.domain.CsvMovieReader;
import moviebuddy.domain.MovieFinder;
import moviebuddy.domain.MovieReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MovieBuddyFactory.DomainModuleConfig.class, MovieBuddyFactory.DataSourceModuleConfig.class})
//XML의 경우
//@ImportResource("xml file location")
public class MovieBuddyFactory {
    @Configuration
    static class DomainModuleConfig {
//    @Bean
//    public MovieFinder movieFinder(){
//        return new MovieFinder(movieReader());
//    }

        //빈스코드
        //빈을 요청 할때마다 새로 생성 : 프로토타입 스코프
        //단 하나의 빈을 생성 : 싱글톤 스코프
        @Bean
//    @Scope("prototype")
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
        public MovieFinder movieFinder(MovieReader movieReader) {
            return new MovieFinder(movieReader);
        }

    }

    @Configuration
    static class DataSourceModuleConfig {
        @Bean
        public MovieReader movieReader() {
            return new CsvMovieReader();
        }
    }
}
