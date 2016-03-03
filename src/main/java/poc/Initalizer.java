package poc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * Created by GEsch on 03.03.2016.
 */
@Configuration
@EnableAutoConfiguration
public class Initalizer implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
    }

    public static void main(String[] args) throws Exception {

        new SpringApplicationBuilder().sources(Initalizer.class).web(true).run(args);
    }

}

