/**
 * @copy right Dossp Company All rights reserved
 * @Title: PersonModel.java
 * @Date: 2020/1/3 17:20
 * @Package com.demo.person.model
 */
package com.demo.person.model;

import com.baomidou.mybatisplus.annotation.TableName;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author weihh
 *         </p>
 *         日期：2020/1/3 17:20
 *         </p>
 *         描述：
 */
@TableName(value = "person")
public class PersonModel implements Serializable {
    private static final long serialVersionUID = -6873678903130806204L;
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String name;

    private String sex;

    private Integer age;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}
