package io.springbatch.springbatchlecture.batch.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ApiResponseVO {

    private int status;
    private String msg;

    @Builder
    public ApiResponseVO(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
