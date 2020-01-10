package com.cn.whatsEgg.TestFramwork;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping
    public HashMap<String,String> index(){
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("姓名", "王二");
        hashMap.put("年龄", "27");
        hashMap.put("工龄", "6");

        return hashMap;
    }

}
