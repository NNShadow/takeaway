package com.takeaway;

import com.takeaway.model.Merchant;
import com.takeaway.service.MerchantService;
import com.takeaway.service.impl.MerchantServiceImpl;

import java.util.List;

//上传商家数据
public class Application {

    public static MerchantService merchantService = new MerchantServiceImpl();
    public static void main(String[] args) {
        init();
        //宿舍
        List<Merchant> merchantList = merchantService.search(117.138817, 34.210431);
        for(Merchant merchant : merchantList){
            System.out.println("商家名称：" + merchant.getName());
            Double distance = merchant.getDistance();
            System.out.println("距离：" + distance.intValue() + "m");
            System.out.println("-----------------");
        }
    }

    private static void init() {
        Merchant merchant = new Merchant();
        merchant.setId("1");
        merchant.setName("三只羊");
        merchant.setLon(118.64091);
        merchant.setLat(32.071747);
        merchantService.add(merchant);

        merchant = new Merchant();
        merchant.setId("2");
        merchant.setName("恋爱鸡蛋灌饼");
        merchant.setLon(118.909998);
        merchant.setLat(31.622769);
        merchantService.add(merchant);

        merchant = new Merchant();
        merchant.setId("3");
        merchant.setName("堕落小龙虾（淮海西路店）");
        merchant.setLon(118.768945);
        merchant.setLat(32.072832);
        merchantService.add(merchant);

        merchant = new Merchant();
        merchant.setId("4");
        merchant.setName("牛佰万牛排饭");
        merchant.setLon(118.830906);
        merchant.setLat(31.915608);
        merchantService.add(merchant);

        merchant = new Merchant();
        merchant.setId("5");
        merchant.setName("食日记");
        merchant.setLon(118.766669);
        merchant.setLat(32.035348);
        merchantService.add(merchant);

        merchant = new Merchant();
        merchant.setId("6");
        merchant.setName("旭升烤肉拌饭");
        merchant.setLon(118.770626);
        merchant.setLat(32.047893);
        merchantService.add(merchant);

        merchant = new Merchant();
        merchant.setId("7");
        merchant.setName("老友部落酸菜鱼");
        merchant.setLon(118.855403);
        merchant.setLat(31.949719);
        merchantService.add(merchant);

        merchant = new Merchant();
        merchant.setId("8");
        merchant.setName("菜饭骨头汤");
        merchant.setLon(118.834089);
        merchant.setLat(32.336467);
        merchantService.add(merchant);
    }
}
