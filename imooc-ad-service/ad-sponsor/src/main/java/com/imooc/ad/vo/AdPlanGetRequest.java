package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-30
 * Time: 6:57 AM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanGetRequest {

    private Long useId;
    private List<Long> ids;

    public boolean validate() {
        return useId != null && !CollectionUtils.isEmpty(ids);
    }
}
