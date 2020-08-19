/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/19 13:59
 */
package com.lin.missyou.dto;

import com.lin.missyou.validators.PasswordEqual;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

// 数据传输对象
@Getter
@Setter
@PasswordEqual(min = 1, message = "两次密码不一致")
public class PersonDTO {

    @Length(max = 10, min = 2, message = "xxxx")
    private String name;
    private Integer age;

    private String password1;
    private String password2;

}