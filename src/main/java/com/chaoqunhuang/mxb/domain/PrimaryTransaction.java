package com.chaoqunhuang.mxb.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * Created by chaoqunhuang on 4/23/18.
 */
@Data
public class PrimaryTransaction {
    private Long id;
    private Date date;
    private String descriptiong;
    private String type;
    private String status;
    private double amount;
    private BigDecimal availableBalance;
    private PrimaryAccount primaryAccount;
}
