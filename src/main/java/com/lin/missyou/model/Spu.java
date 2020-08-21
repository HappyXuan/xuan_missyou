/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/21 13:49
 */
package com.lin.missyou.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Spu {

    @Id
    private Long id;
    private String title;
    private String subtitle;

    @ManyToMany(mappedBy = "spuList")
    private List<Theme> themeList;
}
