package moviebuddy.domain;

import moviebuddy.MovieBuddyFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * packageName : moviebuddy.domain
 * fileName : BeanScopeTest
 * author : psjw
 */
public class BeanScopeTest {
    @Test
    void Equals_MovieFinderBean(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieBuddyFactory.class);
        MovieFinder movieFinder1 = applicationContext.getBean(MovieFinder.class);
        MovieFinder movieFinder2 = applicationContext.getBean(MovieFinder.class);
        Assertions.assertEquals(movieFinder1, movieFinder2);
    }
}
