package knightstory;

import org.springframework.context.support.*;

public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "knightstory/knights.xml"
        );
        Knights knights = context.getBean(Knights.class);
        knights.embarkOnQuest();
        Minstrel minstrel = context.getBean(Minstrel.class);
        minstrel.singBeforeQuest();
        context.close();
    }
}
