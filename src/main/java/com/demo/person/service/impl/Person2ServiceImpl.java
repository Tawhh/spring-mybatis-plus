/**
 * @copy right Dossp Company All rights reserved
 * @Title: Person2ServiceImpl.java
 * @Date: 2020/1/3 19:43
 * @Package com.demo.person.service.impl
 */
package com.demo.person.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.person.mapper.PersonMapper;
import com.demo.person.model.PersonModel;
import com.demo.person.service.Person2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author weihh
 * </p>
 * 日期：2020/1/3 19:43
 * </p>
 * 描述：
 *
 */
@Service
public class Person2ServiceImpl extends ServiceImpl<PersonMapper, PersonModel> implements Person2Service {

    @Autowired
    private PersonMapper personMapper;

}
