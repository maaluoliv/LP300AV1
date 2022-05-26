package AV1300;

import javax.swing.*;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 0, seguro, tipo;
        boolean S;
        double imposto, preco, precoP;

        while (i != 3) {
            System.out.println("Escolha o tipo de veículo: ");
            tipo = ler.nextInt();
            System.out.println("Informe se a carga é perigosa");
            S = ler.nextBoolean();

            seguro = ler.nextInt();
            imposto = ler.nextDouble();
            preco = ler.nextDouble();
            if (tipo = 1 && S = true) {
                imposto = preco * 2.4;
                seguro = imposto/
            } else if (tipo = 1 && S = false) {

            }
        }
    }
}

