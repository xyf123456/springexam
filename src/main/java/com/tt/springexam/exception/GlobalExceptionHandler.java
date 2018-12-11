package com.tt.springexam.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception e){
        System.out.println("GlobalExceptionHandler handlerException()");
        Map<String,Object> map = new HashMap<>();
        map.put("code",100);
        map.put("url",request.getRequestURL());
        map.put("message",e.getMessage());
        map.put("data","访问异常");
        return map;
    }
}
