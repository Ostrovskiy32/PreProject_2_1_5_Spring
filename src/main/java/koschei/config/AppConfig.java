package koschei.config;

import koschei.models.Duck5;
import koschei.models.Island2;
import koschei.models.Rabbit4;
import koschei.models.Wood3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    @Autowired
    public  Wood3 setWood(Rabbit4 rabbit) {
        return new Wood3(rabbit);
    }
    @Bean
    public  Rabbit4 rabbit(Duck5 duck) {
        return new Rabbit4();
    }
}
