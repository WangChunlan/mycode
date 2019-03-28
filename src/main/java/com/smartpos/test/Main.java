package com.smartpos.test;

import com.smartpos.domain.PrepaidCardInfo;
import com.smartpos.domain.SaleGoodsSpec;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangchunlan
 * @ClassName Main.java
 * @Description
 * @createTime 2019年03月27日 16:20:00
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException {




//        userDefinedConstructionMethod();
//        getModifier();
    }

    public static void userDefinedGetFile(){
        PrepaidCardInfo entity=new PrepaidCardInfo();

    }

    /**
     * 获取代码的修饰符 如 pulic static
     */
    public static void getModifier(){
        Field field = null;
        try {
            field = SaleGoodsSpec.class.getField("lastUpdateAt");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
    }

    /**
     *  用户自定义构造方法
     *  通过封装好的方法，利用反射设置构造方法参数
     * @param
     * @description
     * @author wangchunlan
     * @updateTime 2019/3/27 16:36
     **/
    public static void userDefinedConstructionMethod() throws ClassNotFoundException {

        Map<String, Object> map = new HashMap<>();
        map.put("isDeleted", false);
        map.put("lastUpdateAt", new Date());
        map.put("goodsSpecDescription", "这是描述");

//        System.out.println("测试："+ Class.forName(map.get("isDeleted").toString()));

        SaleGoodsSpec goodsSpec = new SaleGoodsSpec(map);
        System.out.println("---------------------");
        System.out.println("isDeleted=" + goodsSpec.isDeleted() + ";lastUpdateAt=" + goodsSpec.getLastUpdateAt() + ";goodsSpecDescription=" + goodsSpec.getGoodsSpecDescription());
    }
}
