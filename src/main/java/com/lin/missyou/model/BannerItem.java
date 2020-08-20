/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/20 14:54
 */
package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class BannerItem {

    @Id
    private Long id;
    private String img;
    private String keyword;
    private String type;
    private String name;

    private Long bannerId;

    @ManyToOne
    @JoinColumn(insertable = false, updatable = false, name = "bannerId")
    private Banner banner;

}
