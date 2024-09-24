package com.paymentprocess.model;

import com.paymentprocess.enums.Moeda;

import java.util.Map;

public class Wallet {
    private User usuario;
    private Map<Moeda, Double> saldos;

    public Wallet(Map saldos, User usuario) {
        this.saldos = saldos;
        this.usuario = usuario;
    }}
