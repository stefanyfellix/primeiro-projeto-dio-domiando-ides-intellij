package br.com.dio;

import br.com.dio.model.Cat;

public class primeiroPrograma {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        System.out.println("Hello World! " + (a + b));

        Cat cat = new Cat("Laranjinha", "Laranja", 4);

        System.out.println("Tenho uma gatinha chamada " + cat.getName() + ", ela tem " + cat.getAge() + " anos e sua cor é " + cat.getColor());
    }
}
