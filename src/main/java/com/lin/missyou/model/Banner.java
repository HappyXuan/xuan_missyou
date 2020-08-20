/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/19 18:19
 */
package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 16)
    private String name;
    @Transient
    private String description;
    private String img;
    private String title;

    @OneToMany(mappedBy = "banner",fetch = FetchType.EAGER)
//    @JoinColumn(name = "bannerId")
    private List<BannerItem> items;

}
