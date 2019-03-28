package com.smartpos.util;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by xumx on 2016/11/4.
 */
public class BaseDomain {

    public BaseDomain() {

    }

    public BaseDomain(Map domainMap) {
        Field[] fields = getClass().getDeclaredFields();
        for (Field f : fields) {
            Object v = domainMap.get(f.getName());
            if (v != null && v instanceof String) {
                if (f.getType().equals(Class.class)) {
                    try {
                        v = Class.forName(v.toString());
                    } catch (Exception e) {
                        System.out.println("构造函数异常 - " + e.getClass().getSimpleName() + " - " + e.getMessage());
                        v = null;
                    }
                } else if (f.getType().equals(BigInteger.class)) {
                    v = new BigInteger(String.valueOf(v));
                } else if (f.getType().equals(BigDecimal.class)) {
                    v = new BigDecimal(String.valueOf(v));
                } else if (f.getType().equals(Date.class)) {
                    try {
                        if(v.toString().contains("T")) {
                            v = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse((String)v);
                        } else {
                            v = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse((String)v);
                        }
                    } catch (Exception e) {
                        System.out.println("构造函数异常 - " + e.getClass().getSimpleName() + " - " + e.getMessage());
                        v = null;
                    }
                } else if (f.getType().equals(Integer.class) || f.getType().equals(int.class)) {
                    v = Integer.valueOf((String)v);
                } else if (f.getType().equals(Boolean.class) || f.getType().equals(boolean.class)) {
                    v = (v.equals("1")||v.equals("true"));
                }
            }
            if (v != null) {
                ReflectionUtils.makeAccessible(f); // 使给定字段可访问，必要时明确设置它可访问
                ReflectionUtils.setField(f, this, v);
            }
        }
    }

}
