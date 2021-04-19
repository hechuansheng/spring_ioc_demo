# spring_ioc_demo

## 组件注册的几种方法
- 使用@Configuration+@Bean注册组件
- 使用@ComponentScan注册组件
- 使用@Import注册组件
## bean的生命周期
- 使用@Bean(initMethod = "init", destroyMethod = "destroy")指定初始化销毁方法
- 使用@PostConstruct，@PreDestroy指定初始化和销毁方法
- 通过implements InitializingBean, DisposableBean指定初始化销毁方法
- 增加前后置处理器BeanPostProcessor
## bean的属性赋值绑定
- @PropertySource加载配置文件
- @Value绑定属性值
## bean的自动装配
- @Autowired自动装配
- @Resource自动装配
- @Inject自动装配
- @Autowired在属性，构造器，方法，参数等位置完成自动装配
## @Profile按环境条件注册组件