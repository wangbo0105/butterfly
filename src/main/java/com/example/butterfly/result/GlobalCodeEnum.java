package com.example.butterfly.result;

public enum GlobalCodeEnum {


    /**
     * 全局返回码定义
     */
    SUCCESS("0", "成功"),
    FAIL("1", "失败"),


    /**
     * 全局返回码定义 - 1000 开头
     */
    GL_VALID_EXCEPTION("10000", "校验错误"),
    GL_SYSTEM_EXCEPTION("10001", "系统异常"),
    GL_BUSINESS_EXCEPTION("10002", "业务异常"),
    GL_PARAM_ERROR("10003", "参数错误"),

    /**
     * 全局返回码定义 - 2000 开头
     */
    GL_CURD_ERROR("20001", "操作失败"),
    GL_INSERT_ERROR("20002", "添加失败"),
    GL_DELETE_ERROR("20003", "删除失败"),
    GL_UPDATE_ERROR("20004", "更新失败"),
    GL_QUERY_ERROR("20005", "查询失败"),


    /**
     * TOKEN鉴权服务：返回码定义 - 4000 开头
     */
    TOKEN_USED("40003", "ticket非法或已被使用过"),
    TOKEN_INVALID("40004", "ticket非法或已被使用过"),


    /**
     * 产品中心-产品查询服务：返回码定义 - 1001开头
     */
    PRODUCT_QUERY_SERVICE_UNAVAILABLE_100101("100101", "产品查询服务不可用"),
    PRODUCT_QUERY_ISSUE_EMPTY_RESULT_100102("100102", "未查询到相关的产品期数信息"),
    PRODUCT_QUERY_CONTINUE_LIST_EMPTY_RESULT_100103("100103", "未查询到相关的续投产品列表信息"),
    PRODUCT_QUERY_CONTINUE_DETAIL_EMPTY_RESULT_100104("100104", "未查询到相关的续投产品详情"),
    PRODUCT_QUERY_PRODUCT_SECOND_CAT_EMPTY_RESULT_100105("100105", "未查询到当前产品一级分类对应的二级分类"),
    PRODUCT_QUERY_GET_QUOTA_FAIL_100106("100106", "获取产品额度信息失败"),
    PRODUCT_QUERY_PRODUCT_CAT_EMPTY_RESULT_100107("100107", "未查询到当前产品的一级分类"),
    PRODUCT_QUERY_ERROR_SELL_STATUS_100108("100108", "不能正确的获取产品售卖状态"),
    PRODUCT_QUERY_PRODUCT_EMPTY_100109("100109", "未查询到产品相关信息  productId=%s, issuePeriod=%s"),
    PRODUCT_QUERY_PRODUCT_CAT_EMPTY_100110("100110", "未查询到产品的分类信息"),
    PRODUCT_QUERY_PRODUCT_ACTIVITY_EMPTY_100111("100111", "未查询到活动产品信息"),
    PRODUCT_QUERY_PRODUCT_INFO_EMPTY_100112("100112", "未查询到产品相关信息"),


    /**
     * 产品中心-资产明细服务：返回码定义 - 1002开头
     */
    PRODUCT_ASSET_SERVICE_UNAVAILABLE_100201("100201", "资产明细服务不可用"),
    PRODUCT_ASSET_PACKAGE_EMPTY_RESULT_100202("100202", "未查询到相关的资产包信息"),
    PRODUCT_ASSET_DETAIL_EMPTY_RESULT_100203("100203", "未查询到相关的资产明细信息"),
    PRODUCT_ASSET_LOAN_EMPTY_RESULT_100204("100204", "未查询到相关的借款工单信息"),


    /**
     * 产品中心-产品额度服务：返回码定义 - 1003开头
     */
    PRODUCT_QUOTA_SERVICE_UNAVAILABLE_100301("100301", "产品额度服务不可用"),
    PRODUCT_QUOTA_SERVICE_UNAVAILABLE_100302("100302", "产品额度占用失败"),
    PRODUCT_QUOTA_SERVICE_UNAVAILABLE_100303("100303", "产品额度确认失败"),
    PRODUCT_QUOTA_SERVICE_UNAVAILABLE_100304("100304", "产品额度释放失败"),


    /**
     * 订单中心—查询返回码：返回码定义 - 2001开头
     */
    ORDER_FUND_FLOW_EMPTY_200101("200101", "未查询到相关的进出账信息"),
    ORDER_CONTINUE_TYPE_EMPTY_200102("200102", "未找到对应的到期处理方式"),
    ORDER_INFO_NOT_EXIST_200103("200103", "未查询到对应的订单信息"),
    ORDER_PARAMS_VALIDATE_INFO_200104("200104", "入参按照要求校验不通过：%s"),
    ORDER_CONTINUE_DATA_EMPTY_200105("200105", "首页订单提醒，未查询到相关的续投订单信息"),
    ORDER_CONTINUE_PRODUCT_DATA_EMPTY_200106("200106", "首页订单提醒，未查询到相关的产品信息"),
    ORDER_CONTINUE_PROFIT_DATA_EMPTY_200107("200107", "首页订单提醒，未查询到相关的收益信息"),
    ORDER_DATE_REDEEM_NOT_EXIST_200108("200108", "未查询到对应的月账户取现记录"),
    ORDER_TYPE_NOT_EXIST_200109("200109", "未找到对应的订单类型"),
    ORDER_CONTRACT_TYPE_NOT_EXIST_200110("200110", "未找到对应的合同类型"),
    ORDER_MONTH_REDEEM_DATA_EMPTY_200111("200111", "未查询到月账户预约取现记录"),
    QUERY_RED_PACKET_EMPTY_200112("200112", "未查询到相应的红包订单信息"),


    /**
     * 订单中心—操作类：返回码定义 - 2002开头
     */
    ORDER_UPDATE_FAIL_200201("200201", "更新订单信息失败"),
    ORDER_VALIDATE_ERROR_200202("200202", "订单入库校验失败"),
    REDEEM_UPDATE_FAIL_200203("200203", "更新月账户取现记录失败"),
    CASH_NOTICE_UPDATE_FAIL_200204("200204", "保存兑付通知失败"),
    RED_PACKET_UPDATE_FAIL_200205("200205", "更新红包取现记录失败"),

    /**
     * 订单中心—赎回类：返回码定义 - 2003开头
     */
    ORDER_REDEEM_DATE_ERROR_200301("200301", "当前日期不合法"),
    ORDER_REDEEM_HAVE_NO_CHANCE_200302("200302", "当月不可取现"),
    ORDER_REDEEM_AMOUNT_ERROR_200303("200303", "可取现有误"),
    ORDER_REDEEM_TIME_ERROR_200304("200304", "在0点到3点之间不可取现"),
    ORDER_REDEEM_CAN_NOT_REDEEM_ERROR_200305("200305", "您当前无可取现金额"),
    ORDER_REDEEM_ERROR_200306("200306", "赎回失败"),
    ORDER_REDEEM_SINGLE_LIMIT_AMOUNT_200307("200307", "您当前输入的金额已超过您每天可预约申请债权转让的上限，您可以选择继续持有，增加期望回报哦~"),
    ORDER_REDEEM_TOTAL_LIMIT_AMOUNT_200308("200308", "您当前输入的金额已超过您每天可预约申请债权转让的上限，您可以选择继续持有，增加期望回报哦~"),
    ORDER_RED_PACKET_RETIRED_200309("200309", "该红包订单已赎回，无需进行取现操作"),
    ORDER_RED_PACKET_TO_THE_ACCOUNT_200310("200310", "该红包订单已到账，无需进行取现操作"),
    ORDER_RETIRED_DATE_ERROR_200311("200311", "当前赎回时间不合法，请在指定赎回时间赎回～"),
    ORDER_CANCEL_AGREEMENT_CANCEL("200312", "无法取消月账户预约取现取消"),

    /**
     * 订单中心—调用第三方服务：返回码定义 - 2004开头
     */
    LCHT_RET_FAIL_200401("200401", "理财后台接口返回失败"),

    /**
     * 订单中心-服务
     */
    ORDER_CENTER_SERVICE_UNAVAILABLE_200501("200501", "订单中心服务不可用");


    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String desc;


    GlobalCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据编码获取枚举类型
     *
     * @param code 编码
     * @return
     */
    public static GlobalCodeEnum getByCode(String code) {
        //判空
        if (code == null) {
            return null;
        }
        //循环处理
        GlobalCodeEnum[] values = GlobalCodeEnum.values();
        for (GlobalCodeEnum value : values) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}