/**Дан список ArrayList<String>. Удалить из него все строки,
 * которые являются числами Пример: ArrayList<String>
 * list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); 
 * ["string", "s", "my_value"] */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ht02{


    public static void main(String[] args){

        List <String> Sarray = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));

        
        
        System.out.println("Исходный массив:");
        System.out.println(Sarray);
        System.out.println("Преобразованный массив:");
        DeleteNumber(Sarray);
        System.out.println(Sarray);
    }
    private static void DeleteNumber(List<String> source){
       
        Iterator<String> iter = source.iterator();

        while (iter.hasNext()) {
            String x  = (String)iter.next();
            if (Parsing(x) == true){
                iter.remove();
            }
            
        }
    }
    private static boolean Parsing(String a){
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
