package com.chaoqunhuang.mxb.domain;

import com.sun.tools.javac.util.List;
import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * Created by chaoqunhuang on 4/23/18.
 */
@Data
public class SavingsAccount {
    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<SavingsTransaction> savingTransactionList;

}
