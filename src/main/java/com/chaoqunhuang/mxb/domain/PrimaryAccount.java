package com.chaoqunhuang.mxb.domain;


import lombok.Data;

import java.util.List;

import java.math.BigDecimal;

/**
 *
 * Created by chaoqunhuang on 4/23/18.
 */
@Data
public class PrimaryAccount {
    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<PrimaryTransaction> primaryTransactionList;

}
