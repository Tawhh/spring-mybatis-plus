/**
 * @copy right Dossp Company All rights reserved
 * @Title: PersonServiceImpl.java
 * @Date: 2020/1/3 17:38
 * @Package com.demo.person.service.impl
 */
package com.demo.person.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.person.mapper.PersonMapper;
import com.demo.person.model.PersonModel;
import com.demo.person.service.Person2Service;
import com.demo.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author weihh
 *         </p>
 *         日期：2020/1/3 17:38
 *         </p>
 *         描述：
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, PersonModel> implements PersonService {

    @Autowired
    private Person2Service person2Service;

    @Override
    public List<PersonModel> getPerson() {
        return person2Service.list();
    }

}
