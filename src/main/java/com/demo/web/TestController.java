/**
 * @copy right Dossp Company All rights reserved
 * @Title: TestController.java
 * @Date: 2020/1/3 14:46
 * @Package com.demo.web
 */
package com.demo.web;

import com.alibaba.fastjson.JSON;
import com.demo.person.model.PersonModel;
import com.demo.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author weihh
 *         </p>
 *         日期：2020/1/3 14:46
 *         </p>
 *         描述：
 */
@Controller
public class TestController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/")
    public String to_index() {
        System.out.println("1111");
        List<PersonModel> list = personService.getPerson();
        System.out.println(JSON.toJSONString(list));

        return "/index";
    }
}
