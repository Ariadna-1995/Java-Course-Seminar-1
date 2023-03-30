package seminar1;
//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class MainClassFromSeminarOne {
    public static void main(String[] args) {
        int[] array = {7, 5, 3, 4, 5, 4, 8, 5};
        int min = array[0];
        int max = array[0];
        int i;
        for(i = 0; i < array.length; i++)
        {
            if(array[i] < min){
                min = array[i];

            }
            if(array[i] > max){
                max = array[i];

            }

        }
        System.out.println(min);
        System.out.println(max);
    }
}



