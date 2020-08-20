/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/20 15:12
 */
package com.lin.missyou.repository;

import com.lin.missyou.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface BannerRepository extends JpaRepository<Banner, Long> {

    Banner findOneById(Long id);

    Banner findOneByName(String name);

}
