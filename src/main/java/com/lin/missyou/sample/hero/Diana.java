/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/17 17:01
 */
package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
@Lazy
public class Diana implements ISkill {

    private String name;
    private Integer age;

    public Diana(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Diana() {
        System.out.println("Diana init");
    }

    public void q() {
        System.out.println("Diana Q");
    }

    public void w() {
        System.out.println("Diana W");
    }

    public void e() {
        System.out.println("Diana E");
    }

    public void r() {
        System.out.println("Diana R");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
