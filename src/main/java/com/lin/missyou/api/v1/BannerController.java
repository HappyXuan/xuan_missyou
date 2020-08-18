/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/14 15:46
 */
package com.lin.missyou.api.v1;

import com.lin.missyou.sample.IConnect;
import com.lin.missyou.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {

    @Autowired
    private ISkill iSkill;

    @Autowired
    private IConnect iConnect;

    @GetMapping("/test")
    public String test() {
        iSkill.r();
        return "hello,Doraemon";
    }

    @GetMapping("/test1")
    public void test1(){
        iConnect.connect();
    }

}
