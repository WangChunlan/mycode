package com.smartpos.controller;

import com.smartpos.utils.CustomDateUtils;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;



public class Constants extends com.saas.common.Constants {
//public class Constants  {
    public static final String SERVICE_NAME_OUT = "out";
    //卡类型-母卡
    public static final Integer CARD_TYPE_MASTER = 1;
    //卡类型-授权卡
    public static final Integer CARD_TYPE_AUTH = 2;
    //卡类型-员工卡
    public static final Integer CARD_TYPE_EMPLOYEE = 3;
    //卡类型-用户会员卡
    public static final Integer CARD_TYPE_USER_MEMBERSHIP = 4;
    //卡类型-用户储值卡
    public static final Integer CARD_TYPE_USER_STORED_VALUE = 5;
    //卡类型-定额储值卡
    public static final Integer CARD_TYPE_FIXED_STORED_VALUE = 6;


    public static final Integer CARD_STATE_ENABLED = 1;
    public static final Integer CARD_STATE_DISABLE = 0;




    public static final String WX_PERMISSION_APPORVE_STATUS_SUBMIT = "0";
/*
*
     * 微信永久授权
*/


    public static final String WX_PERMISSION_TYPE_PERMANENT = "1";
/**
     * 微信暂时授权*/


    public static final String WX_PERMISSION_TYPE_TEMPORAY = "0";


    public static final String WX_PERMISSION_APPORVE_STATUS_PASS = "1";



    public static final String WX_PERMISSION_APPORVE_STATUS_REJECT = "2";

    public static final String STAND_ALONE_EDITION = "standAloneEdition";
    public static final String STANDARD_EDITION = "standardEdition";

    public static final String ELEME_SERVER_URL = "eleme.server.url";
    public static final String ELEME_APP_KEY = "eleme.app.key";
    public static final String ELEME_APP_SECRET = "eleme.app.secret";
    public static final String KEY_ELEME_TOKEN = "_eleme_token";

    public static final String DEPLOYMENT_LOCATION = "deployment.location";
    public static final String SMARTPOS = "smartpos";
    public static final String SANMI = "sanmi";

    public static final String SERVICE_NAME_GATEWAY = "gateway";
    public static final String SERVICE_NAME_ERP = "erp";
    public static final String CONTROLLER_NAME_CLOUD_MONOPOLY = "cloudMonopoly";
    public static final String ACTION_NAME_QUERY_REPORT_DATA = "queryReportData";
    public static final String CONTROLLER_NAME_PROXY = "proxy";



    public static final String LOGGER_ERROR_FORMAT = "%s:%s.%s-%s-%s-%s";
    public static final String PARTITION_CODE = "partition.code";

    public static final String SQL_OPERATION_SYMBOL_IN = "IN";
    public static final String SQL_OPERATION_SYMBOL_NOT_IN = "NOT IN";
    public static final String SQL_OPERATION_SYMBOL_LIKE = "LIKE";
    public static final String SQL_OPERATION_SYMBOL_EQUALS = "=";
    public static final String SQL_OPERATION_SYMBOL_NOT_EQUALS = "!=";
    public static final String SQL_OPERATION_SYMBOL_LESS_THAN = "<";
    public static final String SQL_OPERATION_SYMBOL_LESS_THAN_EQUALS = "<=";
    public static final String SQL_OPERATION_SYMBOL_GREATER_THAN = ">";
    public static final String SQL_OPERATION_SYMBOL_GREATER_THAN_EQUALS = ">=";

    public static final String PARAMETER_ERROR_MESSAGE_PATTERN = "参数(%s)错误！";
    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static final String MINIPROGRAM = "MINIPROGRAM";
    public static final String NATIVE = "NATIVE";
    public static final String APP = "APP";
    public static final String MWEB = "MWEB";
    public static final String JSAPI = "JSAPI";

    public static final String PRIMARY_DATA_SOURCE = "primaryDataSource";
    public static final String SECONDARY_DATA_SOURCE = "secondaryDataSource";
    public static final String ROUTING_DATA_SOURCE = "routingDataSource";

    public static final String SCHEDULER_NAME = "quartzScheduler";
    public static final String APPLICATION_CONTEXT = "applicationContext";
    public static final String QUARTZ_PROPERTIES = "quartz.properties";
    public static final String DEAL_VIP_SCORE_JOB_CRON_EXPRESSION = "deal.vip.score.job.cron.expression";
    public static final String CLEAR_EXPIRED_PERMISSIONS_JOB_CRON_EXPRESSION = "clear.expired.permissions.job.cron.expression";
    public static final String DEAL_STORE_ACCOUNT_JOB_CRON_EXPRESSION = "deal.store.account.job.cron.expression";
    public static final String DEAL_GUIDE_SALE_JOB_CRON_EXPRESSION = "deal.guide.sale.job.cron.expression";
    public static final String DEAL_MESSAGE_RECEIPT_JOB_CRON_EXPRESSION = "deal.message.receipt.job.cron.expression";
    public static final String DEAL_VIP_AUTO_UPGRADE_JOB_CRON_EXPRESSION = "deal.vip.auto.upgrade.job.cron.expression";
    public static final String DEAL_VIP_BIRTHDAY_JOB_CRON_EXPRESSION = "deal.vip.birthday.job.cron.expression";
    public static final String DEAL_VIP_CLEAR_SCORE_JOB_CRON_EXPRESSION = "deal.vip.clear.score.job.cron.expression";
    public static final String DEAL_BRANCH_JOB_CRON_EXPRESSION = "deal.branch.job.cron.expression";
    public static final String DEAL_GRASP_DATA_JOB_CRON_EXPRESSION = "deal.grasp.data.job.cron.expression";
    public static final String DEAL_RETROSPECT_DOWNLOAD_JOB_CRON_EXPRESSION = "deal.retrospect.download.job.cron.expression";
    public static final String DEAL_RETROSPECT_UPLOAD_JOB_CRON_EXPRESSION = "deal.retrospect.upload.job.cron.expression";
    public static final String DEAL_VIP_STATEMENT_JOB_CRON_EXPRESSION = "deal.vip.statement.job.cron.expression";


    public static final String SERVICE_NAME = "service.name";
    public static final String DEPLOY_ENV = "deploy.env";
    public static final String MEI_TUAN_SERVICE_URL = "mei.tuan.service.url";

    public static final String DEPLOY_ENV_SANMI_WWW = "sanmi_www";
    public static final String DEPLOY_ENV_WWW_ALI = "www_ali";
    public static final String DEPLOY_ENV_TEST_51 = "test_51";
    public static final String DEPLOY_ENV_DEV_41 = "dev_41";
    public static final String DEPLOY_ENV_BETA_ALI = "beta_ali";

    public static final BigDecimal BIG_DECIMAL_ONE_HUNDRED = BigDecimal.valueOf(100L);
    public static final BigDecimal BIG_DECIMAL_MINUS_ONE = BigDecimal.valueOf(-1L);
    public static final BigDecimal BIG_DECIMAL_MINUS_TWO = BigDecimal.valueOf(-2L);
    public static final BigDecimal BIG_DECIMAL_MINUS_THREE = BigDecimal.valueOf(-3L);
    public static final BigDecimal BIG_DECIMAL_MINUS_FOUR = BigDecimal.valueOf(-4L);
    public static final BigDecimal BIG_DECIMAL_MINUS_FIVE = BigDecimal.valueOf(-5L);
    public static final BigDecimal BIG_DECIMAL_MINUS_SIX = BigDecimal.valueOf(-6L);
    public static final BigDecimal BIG_DECIMAL_MINUS_SEVEN = BigDecimal.valueOf(-7L);
    public static final BigDecimal BIG_DECIMAL_MINUS_EIGHT = BigDecimal.valueOf(-8L);
    public static final BigDecimal BIG_DECIMAL_MINUS_NINE = BigDecimal.valueOf(-9L);
    public static final BigDecimal BIG_DECIMAL_MINUS_TEN = BigDecimal.valueOf(-10L);

    public static final BigInteger BIG_INTEGER_ONE_HUNDRED = BigInteger.valueOf(100L);
    public static final BigInteger BIG_INTEGER_MINUS_ONE = BigInteger.valueOf(-1L);
    public static final BigInteger BIG_INTEGER_MINUS_TWO = BigInteger.valueOf(-2L);
    public static final BigInteger BIG_INTEGER_MINUS_THREE = BigInteger.valueOf(-3L);
    public static final BigInteger BIG_INTEGER_MINUS_FOUR = BigInteger.valueOf(-4L);
    public static final BigInteger BIG_INTEGER_MINUS_FIVE = BigInteger.valueOf(-5L);
    public static final BigInteger BIG_INTEGER_MINUS_SIX = BigInteger.valueOf(-6L);
    public static final BigInteger BIG_INTEGER_MINUS_SEVEN = BigInteger.valueOf(-7L);
    public static final BigInteger BIG_INTEGER_MINUS_EIGHT = BigInteger.valueOf(-8L);
    public static final BigInteger BIG_INTEGER_MINUS_NINE = BigInteger.valueOf(-9L);
    public static final BigInteger BIG_INTEGER_MINUS_TEN = BigInteger.valueOf(-10L);
    public static final BigInteger BIG_INTEGER_ONE = BigInteger.valueOf(1L);
    public static final BigInteger BIG_INTEGER_TWO = BigInteger.valueOf(2L);
    public static final BigInteger BIG_INTEGER_THREE = BigInteger.valueOf(3L);
    public static final BigInteger BIG_INTEGER_FOUR = BigInteger.valueOf(4L);
    public static final BigInteger BIG_INTEGER_FIVE = BigInteger.valueOf(5L);
    public static final BigInteger BIG_INTEGER_SIX = BigInteger.valueOf(6L);
    public static final BigInteger BIG_INTEGER_SEVEN = BigInteger.valueOf(7L);
    public static final BigInteger BIG_INTEGER_EIGHT = BigInteger.valueOf(8L);
    public static final BigInteger BIG_INTEGER_NINE = BigInteger.valueOf(9L);
    public static final BigInteger BIG_INTEGER_TEN = BigInteger.valueOf(10L);

    public static final String WEI_XIN_OPEN_PLATFORM_APPLICATION_ENCODING_AES_KEY = "wei.xin.open.platform.application.encoding.aes.key";
    public static final String WEI_XIN_OPEN_PLATFORM_APPLICATION_APP_ID = "wei.xin.open.platform.application.app.id";
    public static final String WEI_XIN_OPEN_PLATFORM_APPLICATION_APP_SECRET = "wei.xin.open.platform.application.app.secret";
    public static final String KEY_WEI_XIN_COMPONENT_VERIFY_TICKET = "_wei_xin_component_verify_ticket";
    public static final String KEY_WEI_XIN_AUTHORIZER_TOKENS = "_wei_xin_authorizer_tokens";
    public static final String KEY_WEI_XIN_COMPONENT_ACCESS_TOKEN = "_wei_xin_component_access_token";

    public static final String INIT_QUARTZ = "init.quartz";
    public static final String UPPER_CASE_TRUE = "true";
    public static final String UPPER_CASE_FALSE = "false";
    public static final String LOWER_CASE_TRUE = "true";
    public static final String LOWER_CASE_FALSE = "false";


    public static final int TINYINT_DEFAULT_VALUE = 0;
    public static final int INT_DEFAULT_VALUE = 0;
    public static final BigInteger BIGINT_DEFAULT_VALUE = BigInteger.ZERO;
    public static final BigDecimal DECIMAL_DEFAULT_VALUE = BigDecimal.ZERO;
    public static final Date DATETIME_DEFAULT_VALUE = CustomDateUtils.parse("1970-01-01 00:00:00", DEFAULT_DATE_PATTERN);
    public static final String VARCHAR_DEFAULT_VALUE = "";

    public static final String KEY_FLASH_SALE_ACTIVITY = "_flash_sale_activity";
    public static final String KEY_FLASH_SALE_STOCK = "_flash_sale_stock";
    public static final String KEY_VIP_FLASH_SALE_HISTORY = "_vip_flash_sale_history";
    public static final String KEY_FLASH_SALE_ORDERS = "_flash_sale_orders";

    public static final String SAVE_FLASH_SALE_TASK_COUNT = "save.flash.sale.task.count";
    public static final String CT_CONTROLLER_NAME_AUTH = "auth";
    public static final String CT_ACTION_NAME_INDEX = "index";

    public static final String MINI_PROGRAM = "MINI_PROGRAM";
    public static final String PUBLIC_ACCOUNT = "PUBLIC_ACCOUNT";

    public static final Integer PAID_TYPE_ALIPAY = 1;
    public static final Integer PAID_TYPE_WEI_XIN = 2;
    public static final Integer PAID_TYPE_UM_PAY = 3;
    public static final Integer PAID_TYPE_MIYA = 4;
    public static final Integer PAID_TYPE_NEW_LAND = 5;
    public static final Integer PAID_TYPE_VIP_STORE = 6;

    public static final Integer WAI_MAI_TYPE_MEI_TUAN = 1;
    public static final Integer WAI_MAI_TYPE_ELEME = 2;
    public static final Integer FROM_TYPE_MEI_TUAN = 21;
    public static final Integer FROM_TYPE_ELEME = 20;

    public static final String NORMAL = "normal";
    public static final String EXTRA = "extra";
    public static final String DISCOUNT = "discount";
    public static final String COMBO = "combo";

/**
     * 拼团状态
     *
     * @see #ASSEMBLE_STATUS_ONGOING: 进行中
     * @see #ASSEMBLE_STATUS_COMPLETED: 已完成*/


    public static final Integer ASSEMBLE_STATUS_ONGOING = 1;
    public static final Integer ASSEMBLE_STATUS_COMPLETED = 2;

/**
     * 拼团结果
     *
     * @see #ASSEMBLE_RESULT_SUCCESS: 成功
     * @see #ASSEMBLE_RESULT_FAILURE: 失败
     */

    public static final Integer ASSEMBLE_RESULT_SUCCESS = 1;
    public static final Integer ASSEMBLE_RESULT_FAILURE = 2;

    public static final String TRIGGER_GROUP_ASSEMBLE_COMPLETED = "ASSEMBLE_COMPLETED";
    public static final String JOB_GROUP_ASSEMBLE_COMPLETED = "ASSEMBLE_COMPLETED";

    public static final String SUCCESS = "SUCCESS";
    public static final String WEI_XIN_PAY_CALLBACK_SUCCESS_RETURN_VALUE = "<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>";
    public static final String WEI_XIN_PAY_CALLBACK_FAILURE_RETURN_VALUE = "<xml><return_code><![CDATA[FAILURE]]></return_code></xml>";

    public static final Integer PAY_WAY_WEI_XIN_PAY = 1;
    public static final Integer PAY_WAY_HUO_DAO_PAY = 3;
    public static final Integer PAY_WAY_VIP_STORE_PAY = 4;
    public static final Integer PAY_WAY_BA_TAI_PAY = 5;

    public static final Integer[] PAY_WAYS = {PAY_WAY_WEI_XIN_PAY, PAY_WAY_HUO_DAO_PAY, PAY_WAY_VIP_STORE_PAY, PAY_WAY_BA_TAI_PAY};
    public static final Integer[] PAID_TYPES = {PAID_TYPE_ALIPAY, PAID_TYPE_WEI_XIN, PAID_TYPE_UM_PAY, PAID_TYPE_MIYA, PAID_TYPE_NEW_LAND, PAID_TYPE_VIP_STORE};

/**
     * 订单状态
     *
     * @see #ORDER_STATUS_INVALID: 无效订单
     */

    public static final Integer ORDER_STATUS_INVALID = 100;

    public static final String MEI_TUAN_DEVELOPER_ID = "meituanDeveloperId";
    public static final String MEI_TUAN_SIGN_KEY = "meituanSignKey";

    public static final int BRANCH_TYPE_HSJ = 7;

/**
     * 美团回调类型
     *
     * @see #MEI_TUAN_CALLBACK_TYPE_ORDER_EFFECTIVE: 订单生效
     * @see #MEI_TUAN_CALLBACK_TYPE_ORDER_CANCEL: 订单取消
     * @see #MEI_TUAN_CALLBACK_TYPE_ORDER_REFUND: 订单退款
     * @see #MEI_TUAN_CALLBACK_TYPE_ORDER_CONFIRM: 订单确认
     * @see #MEI_TUAN_CALLBACK_TYPE_ORDER_SETTLED: 订单完成
     * @see #MEI_TUAN_CALLBACK_TYPE_ORDER_SHIPPING_STATUS: 配送状态
     * @see #MEI_TUAN_CALLBACK_TYPE_POI_STATUS: 门店状态变化
     * @see #MEI_TUAN_CALLBACK_TYPE_BINDING_STORE: 门店绑定*/


    public static final Integer MEI_TUAN_CALLBACK_TYPE_ORDER_EFFECTIVE = 1;
    public static final Integer MEI_TUAN_CALLBACK_TYPE_ORDER_CANCEL = 2;
    public static final Integer MEI_TUAN_CALLBACK_TYPE_ORDER_REFUND = 3;
    public static final Integer MEI_TUAN_CALLBACK_TYPE_ORDER_CONFIRM = 4;
    public static final Integer MEI_TUAN_CALLBACK_TYPE_ORDER_SETTLED = 5;
    public static final Integer MEI_TUAN_CALLBACK_TYPE_ORDER_SHIPPING_STATUS = 6;
    public static final Integer MEI_TUAN_CALLBACK_TYPE_POI_STATUS = 7;
    public static final Integer MEI_TUAN_CALLBACK_TYPE_BINDING_STORE = 8;

    public static final String OPT_CD_ACCESS_KEY = "opt.cd.access.key";
    public static final String OPT_CD_SECRET = "opt.cd.secret";
}
