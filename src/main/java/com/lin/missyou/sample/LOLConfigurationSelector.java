/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/18 15:37
 */
package com.lin.missyou.sample;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class LOLConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                HeroConfiguration.class.getName()
        };
    }
}
