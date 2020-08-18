/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/17 18:32
 */
package com.lin.missyou.sample.database;

import com.lin.missyou.sample.IConnect;

public class MySQL implements IConnect {

    private String ip;
    private Integer port;

    public MySQL(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    public MySQL() {
    }

    @Override
    public void connect() {
        System.out.println(this.ip + ":" + this.port);
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
