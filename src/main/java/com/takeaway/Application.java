package com.takeaway;

import com.takeaway.model.Merchant;
import com.takeaway.model.MerchantSearchParam;
import com.takeaway.service.MerchantService;
import com.takeaway.service.impl.MerchantServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

//上传商家数据
public class Application {

    // 指令编写，与上一课不同
    public static MerchantService merchantService = new MerchantServiceImpl();
    public static void main(String[] args) {
        merchantService.init();
        //宿舍

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String command = null;
            try{
                command = bufferedReader.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("执行命令：" + command);

            // startsWith()，字面意思，从字符串0位开始，看是否相等，返回true or false
            if(command.startsWith("add ")){
                String content = command.replaceAll("add ", "");
                // replace(CharSequence target, CharSequence replacement)，用replacement替换所有的target，两个参数都是字符串。
                // replaceAll(String regex, String replacement)，用replacement替换所有的regex匹配项，regex很明显是个正则表达式，replacement是字符串。
                // replaceFirst(String regex, String replacement)，基本和replaceAll相同，区别是只替换第一个匹配项。
                initMerchant(content.split(" "));
            }
            if(command.startsWith("search ")){
                String content = command.replaceAll("search ", "");
                // replace(CharSequence target, CharSequence replacement)，用replacement替换所有的target，两个参数都是字符串。
                // replaceAll(String regex, String replacement)，用replacement替换所有的regex匹配项，regex很明显是个正则表达式，replacement是字符串。
                // replaceFirst(String regex, String replacement)，基本和replaceAll相同，区别是只替换第一个匹配项。
                search(content);
            }
        }
        // 执行数据添加，期望的数据格式是：add 商户ID 商户名称 经度 纬度
        // 执行数据查询，期望的数据格式是：search 商户名称【可选】


    }

    private static void search(String name){
        MerchantSearchParam param = new MerchantSearchParam();
        param.setName(name);
        param.setLon(117.138817);
        param.setLat(34.210431);
        List<Merchant> merchantList = merchantService.search(param);
        for(Merchant merchant : merchantList){
            System.out.println("商家名称：" + merchant.getName());
            System.out.println("距离：" + merchant.getDistance());
            System.out.println("-----------------");
//            System.out.println("商家名称：" + merchant.getName());
//            Double distance = merchant.getDistance();
//            System.out.println("距离：" + distance.intValue() + "m");
//            System.out.println("-----------------");
        }
    }

    private static void initMerchant(String[] items){
        Merchant merchant = new Merchant();
        merchant.setId(items[0]);
        merchant.setName(items[1]);
        merchant.setLon(Double.valueOf(items[2]));
        merchant.setLat(Double.valueOf(items[3]));

        merchantService.add(merchant);
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
