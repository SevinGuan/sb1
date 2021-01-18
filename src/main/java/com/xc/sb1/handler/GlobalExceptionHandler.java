package com.xc.sb1.handler;

import com.xc.sb1.pojo.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 做一个全局的异常处理
     */
    @ExceptionHandler(BindException.class)
    public ResultBean handlerException(Exception e){
            //1.反馈信息给用户
        // 通知核心负责人，系统有问题了，然后发短信，发邮件。
        // 2. 记录错误的日志
        logger.error(e.getMessage());
        return new ResultBean("success","当前服务器繁忙，请稍后再试！");

    }
}
