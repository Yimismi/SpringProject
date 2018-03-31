package soundsystem;

import org.springframework.context.annotation.*;

// CDPlayConfig 类通过 Java 代码定义了Spring的装配规则。
// @ComponentScan 在 Spring 中启用组建扫描。 如果没有其他配置， 默认会扫描与配置类相同的包。
// @ComponentScan(basePackages={"package1", "package2"}) 以 String 形式设置基础包。
// @ComponentScan(basePackageClasses={Class1.class, Class2.class}) basePackageClasses设置的数组中包含了类。
//      这些类所在的包将会作为组建扫描的基础包。
//      可以考虑在包中创建一个用来进行扫描的空标记接口。
@Configuration
@ComponentScan
public class CDPlayConfig {
}
