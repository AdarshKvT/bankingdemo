package com.bank.abc.enitity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountEntity {

    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private int id;

    @Column(name = "holder_name")
    private String holderName;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "account_balance")
    private int accountBalance;

}
