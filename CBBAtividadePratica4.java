/* Crie um programa que elabore o orçamento de uma construtora
* para o cálculo do valor total de construção de uma piscina. O valor
* total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00,
* que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no
* programa para ver se está tudo funcionando corretamente.
*/

public class CBBAtividadePratica4 {
    public static void main(String[] args) {
        int comprimento = 9, largura = 4, altura = 2, volume, valorTotal;

        volume = comprimento * largura * altura;
        valorTotal = volume * 100;

        System.out.println("Valor total da piscina: R$ " + valorTotal + ",00");
    }
} 