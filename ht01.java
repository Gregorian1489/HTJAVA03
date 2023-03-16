// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ht01{


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = in.nextInt();

        List<Integer> IntArray = new ArrayList<>();
        System.out.println("Введите элементы массива");
        
        for (int i = 0; i < size; i++) {
            IntArray.add(in.nextInt()); 
        }
        in.close();
        System.out.println("Исходный массив:");
        System.out.println(IntArray);
        System.out.println("Преобразованный массив:");
        DeleteNegative(IntArray);
        System.out.println(IntArray);
    }
    private static void DeleteNegative(List<Integer> source){
       
        Iterator<Integer> iter = source.iterator();

        while (iter.hasNext()) {
            int x  = (Integer)iter.next();
            if (x < 0){
                iter.remove();

            }
            
        }
    
    
    }

}