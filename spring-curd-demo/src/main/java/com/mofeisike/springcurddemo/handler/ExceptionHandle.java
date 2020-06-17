package com.mofeisike.springcurddemo.handler;

import com.mofeisike.springcurddemo.utill.FormatResponseUtil;
import com.mofeisike.springcurddemo.utill.ResponseResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description: ExceptionHandle <br>
 * date: 2020/6/17 14:08 <br>
 */

@ControllerAdvice
public class ExceptionHandle {

    //只做了一个,一个统一的异常处理, 方便处理所有异常
    @ResponseBody
    @ExceptionHandler(Exception.class)
    private ResponseResult exceptionHandle(Exception e){
        return FormatResponseUtil.error(e);
    }
}
