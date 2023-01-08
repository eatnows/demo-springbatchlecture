package io.springbatch.springbatchlecture.batch.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class ApiInfo {

    private String url;
    private List<? extends ApiRequestVO> apiRequestList;

    @Builder
    public ApiInfo(String url, List<? extends ApiRequestVO> apiRequestList) {
        this.url = url;
        this.apiRequestList = apiRequestList;
    }
}
