package com.gugawag.rpc.banco;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BancoServiceIF extends Remote {

    double saldo(String conta) throws RemoteException;
    int quantidadeContas() throws RemoteException;

    void remocaoDeConta(String conta) throws RemoteException;

    void adicionarConta(Conta conta) throws RemoteException;
}
