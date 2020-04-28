package com.example.provider.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author yang
 */
@Data
@Table(name = "t_user")
public class User {
    @Id
    @KeySql(useGeneratedKeys = true)
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
