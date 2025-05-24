package Labs;

import java.util.ArrayList;

public class main2 {
    public static void main(String[] args){
        //Primeira opçao de array com lengh fixo.
        
        int[] numeros = {1,2,3,4,5,67 };
        System.out.println(numeros[4]);

        //Segunda opçao de array com lengh livre.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        System.out.println(numbers.get(3));
    }
}
