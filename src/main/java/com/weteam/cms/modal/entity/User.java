package com.weteam.cms.modal.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nickname;

    private String username;

    private String password;

    private String openId;

    private String unionId;

    private Byte gender;

    private Byte showMe;

    private String grade;

    private Integer academyId;

    private String contact;

    private String phone;

    private String email;

    private String personInfo;

    private String avatarUrl;

    private Date createTime;

    private Date loginLastTime;

    private Byte loginEnable;

    private Long userViews;

    private static final long serialVersionUID = 1L;

}
