import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,0,1,3,2};
        System.out.println("Выходные данные: " + searchMissingNumber(nums));
    }

    public static int searchMissingNumber(int[] array) {
        System.out.println("Входные данные: " + Arrays.toString(array));
//        сортируем для поиска
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            try {
//                сравниваем значение текущего индекса массива со следующим
                if (array[i]+1 != array[i+1]) {
                    return array[i]+1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
//                прекращаем поиск
            }
        }
//        если нет пропущенного числа
        return -1;
    }
}
