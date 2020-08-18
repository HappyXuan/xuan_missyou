/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/18 16:56
 */
package com.lin.missyou.exception.http;

public class NotFoundException extends HttpException {

    public NotFoundException(int code) {
        this.httpStatusCode = 404;
        this.code = code;
    }

}
