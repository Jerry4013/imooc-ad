package com.imooc.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-31
 * Time: 8:44 AM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitRequest {

    private Long planId;
    private String unitName;

    private Integer positionType;
    private Long budget;

    public boolean createValidate() {
        return planId != null && !StringUtils.isEmpty(unitName) && positionType != null && budget != null;
    }
}
