package com.smartpos.utils;


import saas.api.common.ApiRest;

public interface MethodCaller {
    ApiRest call() throws Exception;
}
