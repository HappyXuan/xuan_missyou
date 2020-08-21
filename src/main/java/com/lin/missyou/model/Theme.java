/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/21 13:49
 */
package com.lin.missyou.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Theme {

    @Id
    private Long id;
    private String title;
    private String name;

    @ManyToMany
    @JoinTable(name = "theme_spu", joinColumns = @JoinColumn(name = "theme_id"),
            inverseJoinColumns = @JoinColumn(name = "spu_id"))
    private List<Spu> spuList;
}
