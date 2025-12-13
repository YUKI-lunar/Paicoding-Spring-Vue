package com.github.paicoding.forum.web.hook.aspect;

import com.github.paicoding.forum.web.global.GlobalInitService;
import com.github.paicoding.forum.web.global.vo.ResultVo;
import jakarta.annotation.Resource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: tech-pai
 * @description:
 * @author: 
 * @create: 2024-06-26
 */

@Aspect
@Component
public class GlobalInfoResponseAspect {

    @Resource
    private GlobalInitService globalInitService;

    @Pointcut("execution(public com.github.paicoding.forum.web.global.vo.ResultVo com.github.paicoding.forum.web..*.*(..))")
    //这里的定义,这又web里返回ResultVo的函数才会被拦截
    public void controllerMethods() {}

    @Around("controllerMethods()")
    public Object modifyGlobalResponse(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = joinPoint.proceed(); // 继续执行原方法

        if (result instanceof ResultVo) {
            ((ResultVo<?>) result).setGlobal(globalInitService.globalAttr());
        }

        return result;
    }
}
