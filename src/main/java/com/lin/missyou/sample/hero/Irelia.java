/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/17 17:45
 */
package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;
import org.springframework.stereotype.Component;

//@Component
public class Irelia implements ISkill {

    public Irelia() {
        System.out.println("Irelia Init");
    }

    @Override
    public void q() {
        System.out.println("Irelia Q");
    }

    @Override
    public void w() {
        System.out.println("Irelia W");
    }

    @Override
    public void e() {
        System.out.println("Irelia E");
    }

    @Override
    public void r() {
        System.out.println("Irelia R");
    }
}
