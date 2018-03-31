package knightstory;

import org.springframework.context.annotation.*;

@Configuration
public class KnightConfig {
    @Bean
    public Knights knights() {
        return new BraveKnight(quest());
    }
    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
