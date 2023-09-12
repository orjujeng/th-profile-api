package com.orjujeng.profile.utils;

public enum ResultCode {
	ACCOUNT_NUM_NOT_FOUND("001"),
	DATA_UPDATE_ERROR("002"),
	DATA_INSTER_ERROR("003"),
	VALID_ERROR("401"),
	SUCCESS("200"),
    FAIL("400"),
    INTERNAL_SERVER_ERROR("500");

    public String code;
    ResultCode(String code) {
        this.code = code;
    }
}
