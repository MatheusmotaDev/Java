package poo.construtores.av1;

public class Quadrado {

    int lado;

    Quadrado() {
    }

    Quadrado(int lado) {
        this.lado = lado;
    }

    double area() {
        return lado * lado;
    }

    double comprimento() {
        return lado * 4;
    }

    void desenha() {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}