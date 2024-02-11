package com.app.global.error;

import lombok.Getter;

@Getter
public enum ErrorCode {

    // 공통
    SERVER_ERROR("COMMON-001", "요청을 처리하는 중 오류가 발생하였습니다. 관리자에게 문의해주세요"),

    // 메뉴
    NOT_EXIST_MENU("MENU-001", "메뉴가 존재하지 않습니다."),


    ;






    ErrorCode(String errorCode, String message){
        this.errorCode = errorCode;
        this.message = message;
    }

    private String errorCode;
    private String message;
}
