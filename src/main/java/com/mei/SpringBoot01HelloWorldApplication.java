package com.mei;

import ch.qos.logback.core.db.DBHelper;
import com.mei.beans.Pet;
import com.mei.beans.User;
import com.mei.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类。主配置类
 * @SpringBootApplication 标注这个类是一个spring boot的应用,启动类下的所有资源被导入
 *
 */
@SpringBootApplication(scanBasePackages = "com.mei")
public class SpringBoot01HelloWorldApplication {

    public static void main(String[] args) {
        //1.将springBoot应用启动,返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(SpringBoot01HelloWorldApplication.class, args);

        //2.查看容器裏面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        //3.从容器中获取组件
        //Pet tom01 = run.getBean("tom", Pet.class);
        //Pet tom02 = run.getBean("tom", Pet.class);
        //System.out.println(tom02 == tom01);
        //
        ////4.com.mei.config.MyConfig$$EnhancerBySpringCGLIB$$36be1327@1e469dfd
        //MyConfig bean = run.getBean(MyConfig.class);
        //System.out.println(bean);
        //
        ////如果@Configuration(proxyBeanMethods = true) 代理对象调用方法。SpringBoot总会检查这组件是否在容器中，保持组件单实例
        //User user = bean.user01();
        //User user1 = bean.user01();
        //System.out.println(user1 == user);
        //
        //User user01 = run.getBean("user01", User.class);
        //Pet tom = run.getBean("tom", Pet.class);
        //
        //System.out.println("用户信息：" + user01.toString());
        //System.out.println("用户的宠物：" + user01.getPet());
        //System.out.println("容器内的宠物：" + tom);
        //System.out.println("用户的宠物是不是容器内的宠物：" + (user01.getPet() == tom));

        //5.获取组件
        String[] namesForType = run.getBeanNamesForType(User.class);
        System.out.println("======================================");
        for (String s : namesForType) {
            System.out.println(s);
        }
        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);

        //查看容器中是否拥有组件
        boolean tom = run.containsBean("tom");
        System.out.println("容器中是否包含tom组件：" + tom);
        System.out.println("容器中是否包含user01组件：" + run.containsBean("user01"));

    }

}
