/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/17 17:01
 */
package com.lin.missyou.sample.hero;

import com.lin.missyou.sample.ISkill;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Diana implements ISkill {

    public Diana() {
        System.out.println("Hello 7月");
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

}
