package com.takeaway.service.impl;

import com.takeaway.model.Merchant;
import com.takeaway.model.MerchantSearchParam;
import com.takeaway.service.MerchantService;
import com.takeaway.util.DistanceUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//设计商家服务
public class MerchantServiceImpl extends MerchantFileStoreServiceImpl {
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

        List<Merchant> merchantList = merchants.values().stream().collect(Collectors.toList());
        store(merchantList);
    }

    //商家查询方法
//    @Override
//    public List<Merchant> search(MerchantSearchParam param) {
//        List<Merchant> merchantList = new ArrayList<Merchant>();
//        for(Map.Entry<String, Merchant> merchantEntry : merchants.entrySet()){
//            Merchant merchant = merchantEntry.getValue();
//
//            Double distance = DistanceUtil.getDistance(param.getLon(), param.getLat(), merchant.getLon(), merchant.getLat());
//            merchant.setDistance(distance);
//            merchantList.add(merchantEntry.getValue());
//        }
//        return merchantList;
//    }

//    重构 MerchatServiceImpl
    @Override
    public List<Merchant> search(MerchantSearchParam param) {
        List<Merchant> merchantList = new ArrayList<Merchant>();
        for(Map.Entry<String, Merchant> merchantEntry : merchants.entrySet()){
            Merchant merchant = merchantEntry.getValue();

            Double distance = DistanceUtil.getDistance(param.getLon(), param.getLat(), merchant.getLon(), merchant.getLat());
            merchant.setDistance(distance);
            merchantList.add(merchantEntry.getValue());
        }

        Stream<Merchant> stream = merchantList.stream();
        if(param.getName() != null && ! param.getName().equals("")){
            stream = stream.filter(m -> m.getName().indexOf(param.getName()) >= 0);
        }
        //迷之排序，我完全没看懂怎么排的
        stream = stream.sorted((m1, m2) ->
                ((Double) m2.getDistance()).intValue() -
                ((Double) m1.getDistance()).intValue());

        return stream.collect(Collectors.toList());
    }
}
