Sping自动装配

**前言**
在spring中，**容器**负责对象查找或创建与其所关联的其他对象；

依赖注入本质：创建对象之间协作关系的行为，装配。

spring提供3种主要的装配机制：
1. XML中显式装配 （最后）
2. java中显式配置 （其次）
3. 隐式的bean发现机制和自动装配 （优选）

实现wiring：组件扫描Component scanning和自动装配autowiring

2.1 自动装配：
    1. CdPlayer实现MediaPlayer接口、SgtPeppersDisk实现CompactDisk接口
    2. CdPlayer类中装载CompactDisk接口
    3. test类中装载CdPlayer类，并调用CompactDisk接口。
    通过接口的装载间接实现方法调用。
    
2.2 通过java代码装配Bean
  自动装配方案不适用的场景：将第三方库中的组件装配到应用中。无法在类中使用@Component和@Autowired注解。
  此时使用JavaConfig方式和XML方式。
  1. 在javaconfig类中配置Bean，并注解@Configuration.
  2. 使用时，告诉@ContextConfiguration中使用的JavaConfig配置类。





