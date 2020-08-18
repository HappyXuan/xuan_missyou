/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/18 15:29
 */
package com.lin.missyou;

import com.lin.missyou.sample.EnableLOLConfiguration;
import com.lin.missyou.sample.HeroConfiguration;
import com.lin.missyou.sample.ISkill;
import com.lin.missyou.sample.LOLConfigurationSelector;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

//@ComponentScan
//@Import(LOLConfigurationSelector.class)
@EnableLOLConfiguration
public class LOLApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(LOLApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        ISkill iSkill = (ISkill) context.getBean("irelia");
        iSkill.r();
    }

}
