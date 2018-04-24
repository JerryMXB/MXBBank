package com.chaoqunhuang.mxb.domain;

import lombok.Data;

import java.util.Date;

/**
 *
 * Created by chaoqunhuang on 4/23/18.
 */
@Data
public class Appointment {
    private Long id;
    private Date date;
    private String location;
    private String description;
    private boolean confirmed;

    private User user;
}
