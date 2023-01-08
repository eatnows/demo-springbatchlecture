package io.springbatch.springbatchlecture.batch.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
public class ApiRequestVO {
    private long id;
    private ProductVO productVO;
    private ApiResponseVO apiResponseVO;

    @Builder
    public ApiRequestVO(long id, ProductVO productVO, ApiResponseVO apiResponseVO) {
        this.id = id;
        this.productVO = productVO;
        this.apiResponseVO = apiResponseVO;
    }

    public void setApiResponseVO(ApiResponseVO apiResponseVO) {
        this.apiResponseVO = apiResponseVO;
    }
}
