package soundsystem;

import org.springframework.stereotype.*;


// @Component 表明该类会作为组建类，并告知 Spring 要为这个类创建 bean
// @Component(ID) 指名创建 bean 的名字， 可用 @Name(ID) 代替

@Component
public class sgtPeppers implements CompactDisc{
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
