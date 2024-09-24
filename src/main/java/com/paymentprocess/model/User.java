package com.paymentprocess.model;

public class User {
    private String nome;
    private String email;
    private String cpf;
    private Wallet carteira;

    public User(String nome, String email, String cpf, Wallet carteira) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.carteira = carteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Wallet getCarteira() {
        return carteira;
    }

    public void setCarteira(Wallet carteira) {
        this.carteira = carteira;
    }


}
