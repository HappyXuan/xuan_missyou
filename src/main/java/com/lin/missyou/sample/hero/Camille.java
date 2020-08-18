/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/17 18:06
 */
package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

//@Component
public class Camille implements ISkill {

    private String name;
    private Integer age;

    public Camille(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Camille() {
        System.out.println("Camille init");
    }

    @Override
    public void q() {
        System.out.println("Camille Q");
    }

    @Override
    public void w() {
        System.out.println("Camille W");
    }

    @Override
    public void e() {
        System.out.println("Camille E");
    }

    @Override
    public void r() {
        System.out.println("Camille R");
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
