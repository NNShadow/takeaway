package com.takeaway.service;

import com.takeaway.model.Merchant;
import com.takeaway.model.MerchantSearchParam;

import java.util.List;

/*
* 商家服务
* @author npy
 */
public interface MerchantService {
    public void init();
    //添加商家
    public void add(Merchant merchant);
    //根据经纬度查询商家信息
    public List<Merchant> search(MerchantSearchParam param);
}
