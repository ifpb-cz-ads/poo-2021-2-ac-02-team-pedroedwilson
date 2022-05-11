/*
 * Declare uma variável chamada long1 do tipo long e a inicialize com 100.
 * Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com
 * 200. Agora faça int2 receber int1 mais long1 e explique os resultados.
 * Arrume o código para que não ocorra o erro anterior.
*/

public class BMExercicio04 {
    public static void main(String[] args) {
        long long1 = 100;
        int int1 = 200, int2;

        /* int2 = int1 + long1;
         * Ao tentar compilar o código, o compilador retorna o erro de tipos incompatíveis,
         * pois uma variável do tipo int não pode receber a soma de um int mais um long
         * devido o tipo int possuir uma quantidade menor de bits para armazenar valores.
        */

        int2 = int1 + (int) long1;

        System.out.println(int2);
    }
}
