package one.innovation.digital;

/*
 * Author: Fernando
 * Data  : 20.07.2021
 */
public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("GM", "Corsa", "2000");
        System.out.println("Veículo marca: " + carro.getMarca() +
                           ", modelo: "      + carro.getModelo() +
                           ", ano: "         + carro.getAno());
    }
}
