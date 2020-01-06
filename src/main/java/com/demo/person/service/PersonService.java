/**
 * @copy right Dossp Company All rights reserved
 * @Title: PersonService.java
 * @Date: 2020/1/3 17:37
 * @Package com.demo.person.service
 */
package com.demo.person.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.person.model.PersonModel;

import java.util.List;

/**
 * @author weihh
 *         </p>
 *         日期：2020/1/3 17:37
 *         </p>
 *         描述：
 */
public interface PersonService extends IService<PersonModel> {

    public List<PersonModel> getPerson();
}
