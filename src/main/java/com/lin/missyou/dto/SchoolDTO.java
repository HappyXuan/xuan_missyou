/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/19 14:37
 */
package com.lin.missyou.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class SchoolDTO {

    @Length(min = 2)
    private String schoolName;

}
