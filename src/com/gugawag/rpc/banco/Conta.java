package com.gugawag.rpc.banco;

public class Conta {

    private String numero;
    private Double saldo;

    public Conta(String numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


}
