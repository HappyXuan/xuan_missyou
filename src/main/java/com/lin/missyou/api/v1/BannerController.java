/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/14 15:46
 */
package com.lin.missyou.api.v1;

import com.lin.missyou.exception.http.ForbiddenException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner")
public class BannerController {

    @GetMapping("/test")
    public String test() throws Exception {
        int a = 1;
        int b = 0;

        throw new ForbiddenException(10001);
    }

}
