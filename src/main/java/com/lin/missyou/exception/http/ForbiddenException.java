/**
 * @作者 想做哆啦A梦的程序员
 * @description: linxuan1103@gmail.com
 * @创建时间 2020/8/18 16:58
 */
package com.lin.missyou.exception.http;

public class ForbiddenException extends HttpException{

    public ForbiddenException(int code) {
        this.httpStatusCode = 403;
        this.code = code;
    }

}
