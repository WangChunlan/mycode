package com.smartpos.util;


import saas.api.common.ApiRest;

public interface MethodCaller {
    ApiRest call() throws Exception;
}
