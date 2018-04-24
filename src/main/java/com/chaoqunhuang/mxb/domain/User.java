package com.chaoqunhuang.mxb.domain;

import lombok.Data;

import java.util.List;

/**
 *
 * Created by chaoqunhuang on 4/23/18.
 */
@Data
public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private boolean enabled = true;

    private PrimaryAccount primaryAccount;
    private SavingsAccount savingsAccount;
    private List<Appointment> appointmentList;
    private List<Recipient> recipientList;

}
