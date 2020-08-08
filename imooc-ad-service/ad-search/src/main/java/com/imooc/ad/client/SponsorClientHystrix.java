package com.imooc.ad.client;

import com.imooc.ad.client.vo.AdPlan;
import com.imooc.ad.client.vo.AdPlanGetRequest;
import com.imooc.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Jingchao Zhang
 * Date: 2020-08-07
 * Time: 9:56 PM
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlan(AdPlanGetRequest request) {
        return new CommonResponse<>(-1, "eureka-client-ad-sponsor error");
    }
}
