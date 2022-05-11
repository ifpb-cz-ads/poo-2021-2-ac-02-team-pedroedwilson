class BMExercicio03 {
    public static void main(String[] args) {
        double valorItem01 = 2.95;
        double valorItem02 = 3.50;

        System.out.println("O Item 1 custa " + valorItem01);
        System.out.println("O Item 2 custa " + valorItem02);

        double custoTotalItens = valorItem01 + valorItem02;
        System.out.println("O custo total dos dois itens eh " + custoTotalItens);

        final double taxaCalculada = (custoTotalItens * 8.25)/100;
        System.out.println("A taxa cobrada eh de " + taxaCalculada);

        double novoValorItem01 = valorItem01 + taxaCalculada;
        double novoValorItem02 = valorItem02 + taxaCalculada;

        double novoCusto = novoValorItem01 + novoValorItem02;
        System.out.println("O novo custo total dos itens eh " + novoCusto);

        boolean muitoCaro = novoCusto > 10;
        System.out.println("O valor dito em muito caro eh: " + muitoCaro);
    }
}
