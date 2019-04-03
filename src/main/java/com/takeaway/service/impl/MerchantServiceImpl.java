package com.takeaway.service.impl;

import com.takeaway.model.Merchant;
import com.takeaway.service.MerchantService;
import com.takeaway.util.DistanceUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//设计商家服务
public class MerchantServiceImpl implements MerchantService {
    private Map<String, Merchant> merchants;

    @Override
    public void add(Merchant merchant) {
        //初始化 merchants
        if(merchants == null){
            merchants = new HashMap<String, Merchant>();
        }
        //数据校验
        if(merchant == null){
            return;
        }
        //往 map 中添加数据
        merchants.put(merchant.getId(), merchant);
    }

    //商家查询方法
    @Override
    public List<Merchant> search(double lon, double lat) {
        List<Merchant> merchantList = new ArrayList<Merchant>();
        for(Map.Entry<String, Merchant> merchantEntry : merchants.entrySet()){
            Merchant merchant = merchantEntry.getValue();

            Double distance = DistanceUtil.getDistance(lon, lat, merchant.getLon(), merchant.getLat());
            merchant.setDistance(distance);
            merchantList.add(merchantEntry.getValue());
        }
        return merchantList;
    }
}
