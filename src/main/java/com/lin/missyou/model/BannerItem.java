/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/20 14:54
 */
package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

<<<<<<< HEAD
import javax.persistence.*;
=======
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
>>>>>>> 12fa53a0c91484d7b68238b939718dd6816248cf

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
<<<<<<< HEAD
    @JoinColumn(foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT), insertable = false, updatable = false, name = "bannerId")
=======
    @JoinColumn(insertable = false, updatable = false, name = "bannerId")
>>>>>>> 12fa53a0c91484d7b68238b939718dd6816248cf
    private Banner banner;

}
