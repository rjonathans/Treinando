package br.com.modelobanco;

import com.sun.org.apache.xerces.internal.dom.DOMNormalizer;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class ContaBanco {
    //Atributos
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Construtores
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
        this.setDono("Uknowm");
    }

    //Metodos Personalizados
    public void abrirConta() {

        System.out.println("Digite seu nome: ");
        Scanner teclado = new Scanner(System.in);
        this.setDono(teclado.nextLine());

        System.out.println("Qual o tipo de conta você deseja abrir? \n 1.CONTA POUPANÇA \n 2.CONTA CORRENTE");
        Scanner teclado2 = new Scanner(System.in);
        this.setTipo(teclado2.nextLine());
        this.setStatus(true);

        depositar();

        if (tipo.equals("1")) {
            this.setStatus(true);
            this.setSaldo(50);
            this.setTipo("Conta Poupança");

        } else if (tipo.equals("2")) {
            this.setStatus(true);
            this.setSaldo(100);
            this.setTipo("Conta Corrente");
        }
        System.out.println("Olá " + getDono() + "Sua " + getTipo() + " foi aberta com sucesso!");
        System.out.println("NOME: " + getDono());
        System.out.println(getTipo()+" de Nº: " + getNumConta());
        System.out.println("SALDO: " + getSaldo());
    }

    public void fecharConta() {

    }

    public void depositar() {

        System.out.println("Gostaria de depositar algum valor? \n 1.SIM / 2 NÂO");
        Scanner teclado3 = new Scanner(System.in);
        String resposta = teclado3.nextLine();

        if (resposta.equals("1")){

            System.out.println("Digite o valor deseja depositar:");
            Scanner teclado4 = new Scanner(System.in);
            this.setSaldo(getSaldo()+ teclado4.nextDouble());
            recolherTaxas();

        } else if (resposta.equals("2")){

            System.out.println("Você escolheu a opção 2. \n Nenhum valor foi depositado em sua conta!");
        }

    }

    public void sacar() {

    }

    public void recolherTaxas() {

    }

    //Metodos Especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
