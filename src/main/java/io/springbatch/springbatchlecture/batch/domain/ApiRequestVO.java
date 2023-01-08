package io.springbatch.springbatchlecture.batch.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ApiRequestVO {
    private long id;
    private ProductVO productVO;

    @Builder
    public ApiRequestVO(long id, ProductVO productVO) {
        this.id = id;
        this.productVO = productVO;
    }
}
