package moviebuddy;

import moviebuddy.domain.CsvMovieReader;
import moviebuddy.domain.MovieFinder;
import moviebuddy.domain.MovieReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * packageName : moviebuddy
 * fileName : MovieBuddyFactory
 * author : psjw
 */
@Configuration
//다른 클래스에서 구성정보를 불러옴
@Import({MovieBuddyFactory.DomainModuleCOnfig.class, MovieBuddyFactory.DataSourceModuleConfig.class})
//@ImportResource("xml file location") //xml 파일 가져옴
public class MovieBuddyFactory {
//    @Bean
//    public MovieReader movieReader() {
//        return new CsvMovieReader();
//    }
//    @Bean
////    @DependsOn
////    @Scope
//    public MovieFinder movieFinder(){
//        //1. 메서드 콜방식
//        return new MovieFinder(movieReader());
//    }

//    @Bean
////    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // 동일 : @Scope("prototype") -> 호출이 될때마다 매번 객체생성
//    //2.메서드 파라미터
//    public MovieFinder movieFinder(MovieReader movieReader) {
//        return new MovieFinder(movieReader);
//    }

    @Configuration
    static class DomainModuleCOnfig {
        @Bean
        public MovieReader movieReader() {
            return new CsvMovieReader();
        }
    }

    @Configuration
    static class DataSourceModuleConfig {
        @Bean
        public MovieFinder movieFinder(MovieReader movieReader) {
            return new MovieFinder(movieReader);
        }
    }
}
