package com.smartpos.aspects;

import com.smartpos.configurations.DataSourceContextHolder;
import com.smartpos.controller.Constants;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
/**
 * 注意： 切面com.smartpos.service 为java 根目录下
 * @Description
 * @author wangchunlan
 * @createTime 2019/6/1 17:41
 */
@Aspect
@Order(value = 1)
public class DataSourceRoutingAspect {
    @Before(value = "execution(public * com.smartpos.service..*(..))")
    public void setDataSource(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        boolean setComplete = setDataSourceType(method.getAnnotation(Transactional.class));
        if (setComplete) {
            return;
        }
        setComplete = setDataSourceType(joinPoint.getTarget().getClass().getAnnotation(Transactional.class));
        if (setComplete) {
            return;
        }
        DataSourceContextHolder.setDataSourceType(Constants.PRIMARY_DATA_SOURCE);
    }

    private boolean setDataSourceType(Transactional transactional) {
        if (transactional == null) {
            return false;
        }
        if (transactional.readOnly()) {
            DataSourceContextHolder.setDataSourceType(Constants.SECONDARY_DATA_SOURCE);
        } else {
            DataSourceContextHolder.setDataSourceType(Constants.PRIMARY_DATA_SOURCE);
        }
        return true;
    }
}
