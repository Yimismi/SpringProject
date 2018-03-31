package soundsystem;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

// @Autowired 申明进行自动装配。
// 构造器上添加 @Autowired 注解， 表明当 Spring 创建 bean 的时候， 会通过这个构造器来进行实例化并会传入一个可设置
// 给 CompactDisc 类型的 bean。
// @Autowired 注解还可用在属性的Setter方法上。 实际上可用在任何方法上。
// 当 Spring 不能完成自动装配时， 会抛出异常。 可以将 required 属性设置为 false 来避免异常（没有匹配的 bean 时，
// Spring 会使这个 bean 处于未配置状态， 可能会抛出 NullPointerException）。
// 可使用 @Inject 注解代替 @Autowired。

@Component
public class MediaPlayer {

    // @Autowired
    private CompactDisc cd;

    @Autowired
    public MediaPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    /*
    @Autowired
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }
    */
}
