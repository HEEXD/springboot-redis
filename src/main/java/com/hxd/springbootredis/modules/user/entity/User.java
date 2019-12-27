package com.hxd.springbootredis.modules.user.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by hee on 2019/12/26 14:00
 */
@Data
@Builder
public class User implements Serializable {

    private static final long serialVersionUID = 7433437449182930888L;

    private String id;

    private String username;

    private String age;
}
