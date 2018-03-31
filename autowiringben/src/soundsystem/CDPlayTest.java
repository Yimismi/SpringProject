package soundsystem;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;
import static org.junit.Assert.*;

// SpringJUnit4ClassRunner 在测试开始时创建 Spring 的应用上下文
// @ContextConfiguration 指明要从 CDPlayConfig 中加载配置

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayConfig.class)
public class CDPlayTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
    }

}
