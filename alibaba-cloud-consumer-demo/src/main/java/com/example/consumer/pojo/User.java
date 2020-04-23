package com.example.consumer.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author yang
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String sex;
    private Date birthday;
    private Date createDate;
    private Date updateDate;
    private String note;
}
