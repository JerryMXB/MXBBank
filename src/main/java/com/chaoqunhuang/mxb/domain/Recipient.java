package com.chaoqunhuang.mxb.domain;

import lombok.Data;

/**
 *
 * Created by chaoqunhuang on 4/23/18.
 */
@Data
public class Recipient {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String accountNumber;
    private String description;

    private User user;
}
