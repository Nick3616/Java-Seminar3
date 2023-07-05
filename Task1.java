//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

public class Task1{
    public static void main(String[] args) {
        List<Integer> list = createList(10, 1, 20);
        System.out.println("Начальный массив: " + list);
        System.out.println("Максимальный элемент: " + Collections.max(list));
        System.out.println("Минимальный элемент:  " + Collections.min(list));
        System.out.println("Средние значение:  " + averageValue(list));
        System.out.println("Массив с удаленными четными числами: " + oddNumbers(list));
        
    }
    static List<Integer> createList(int size, int min, int max){
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            list.add((int)(Math.random() * (max - min + 1) + min));
        }
     return list;
    }   
    static List<Integer> oddNumbers(List<Integer> list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = (Integer) iterator.next();
            if(i % 2 == 0){
                iterator.remove();
            }
        }
        return (List<Integer>) list;
    }
    static int averageValue(List<Integer> list){
        int size = list.size();
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += list.get(i);
        }
        int average = sum / size; 
        return average;
    }
}