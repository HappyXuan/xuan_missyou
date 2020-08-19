/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/14 15:46
 */
package com.lin.missyou.api.v1;

import com.lin.missyou.dto.PersonDTO;
import com.lin.missyou.exception.http.ForbiddenException;
import com.lin.missyou.service.BannerService;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @GetMapping("/name/{name}")
    public void getByName(@PathVariable String name){
        bannerService.getByName(name);
    }

    @PostMapping("/test/{id}")
    public String test(@PathVariable @Range(min = 1, max = 10, message = "不可以超过10噢") Integer id,
                       @RequestParam String name,
                       @RequestBody @Validated PersonDTO person) throws Exception {
        PersonDTO personDTO = new PersonDTO();

        throw new ForbiddenException(10001);
    }

}
