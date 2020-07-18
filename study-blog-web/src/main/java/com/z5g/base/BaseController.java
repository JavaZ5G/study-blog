package com.z5g.base;


import com.alibaba.fastjson.JSONObject;
import domain.BaseResponse;
import enumeration.ResponseCodeEnum;

/**
 * @author JavaZ5G
 * @date 2020/6/21 5:35 PM
 */
public class BaseController {
    public BaseResponse success(String requestId) {
        return new BaseResponse(requestId, ResponseCodeEnum.success.getValue(), null, null);
    }

    public BaseResponse success(String requestId, Object data) {
        return new BaseResponse(requestId, ResponseCodeEnum.success.getValue(), null, data);
    }

    public BaseResponse fail(String requestId) {
        return new BaseResponse(requestId, ResponseCodeEnum.fail.getValue(), null, null);
    }
}
