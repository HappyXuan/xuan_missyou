/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/14 15:46
 */
package com.lin.missyou.api.v1;

import com.lin.missyou.sample.ISkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {

    @Autowired
    @Qualifier("irelia")
    private ISkill diana;

    @GetMapping("/test")
    public String test() {
        diana.r();
        return "hello,Doraemon";
    }

}
