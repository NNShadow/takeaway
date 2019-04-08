package com.takeaway.control;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.takeaway.model.Merchant;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class JsonTest {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        // 读取 json 文件，转化为 list 格式
        List<Merchant> merchantList = null;
        try{
            merchantList = objectMapper.readValue(
                    new File("./demo.json"),
                    new TypeReference<List<Merchant>>(){});
        }catch (IOException e){
            e.printStackTrace();
        }

        // 执行 stream 过滤
        List<Merchant> merchantList1 = merchantList.stream().
                filter(m ->m.getName().indexOf("必胜客") >= 0).collect(Collectors.toList());
        for (Merchant merchant : merchantList1){
            System.out.println(merchant.getId());
            System.out.println(merchant.getName());
            System.out.println(merchant.getDistance());
        }
    }
}
