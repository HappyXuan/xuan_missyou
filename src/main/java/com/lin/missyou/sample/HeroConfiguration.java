/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/17 18:08
 */
package com.lin.missyou.sample;

import com.lin.missyou.sample.ISkill;
import com.lin.missyou.sample.condition.DianaCondition;
import com.lin.missyou.sample.condition.IreliaCondition;
import com.lin.missyou.sample.hero.Camille;
import com.lin.missyou.sample.hero.Diana;
import com.lin.missyou.sample.hero.Irelia;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroConfiguration {

//    @Bean
//    @Conditional(DianaCondition.class)
//    @ConditionalOnProperty(value = "hero.condition", havingValue = "diana", matchIfMissing = true)
//    @ConditionalOnBean(name = "mysql")
//    @ConditionalOnMissingBean(name = "mysql")
    public ISkill diana() {
        return new Diana("Diana", 18);
    }

    @Bean
//    @Conditional(IreliaCondition.class)
//    @ConditionalOnProperty(value = "hero.condition", havingValue = "irelia")
    public ISkill irelia() {
        return new Irelia();
    }

}
