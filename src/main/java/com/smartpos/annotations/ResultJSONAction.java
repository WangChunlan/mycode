
package com.smartpos.annotations;



import com.smartpos.utils.BasicModel;

import java.lang.annotation.*;



@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResultJSONAction {
    Class<? extends BasicModel> modelClass() default BasicModel.class;

    Class<?> serviceClass() default Object.class;

    String serviceMethodName() default "";

    String error() default "";

    String datePattern() default "";
}

