package br.com.modelobanco;

public class Principal {
    public static void main(String[] args) {

        ContaBanco pessoa1 = new ContaBanco();
        pessoa1.setStatus(true);
        pessoa1.setNumConta(159848);
        pessoa1.abrirConta();

    }
}
