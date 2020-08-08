package com.imooc.ad.client.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Jingchao Zhang
 * Date: 2020-08-07
 * Time: 9:11 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanGetRequest {

    private Long userId;
    private List<Long> ids;
}
