import java.util.Arrays;    // Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program.
public class Main {
    public static void main(String[] args){

        int[] a = {3, 7, 0, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 10, 10, 8, 0, 0, 8, 0, 2, 2};
        findRepeatNumbers(a);

    }
    static void findRepeatNumbers(int[] array){
        int[] duplicate = new int[array.length];
        Arrays.fill(duplicate, -1);
        int startIndex = 0;

        for(int i = 0; i < array.length; i++){
            for(int k = i + 1; k < array.length; k++){
                if(array[i] == array[k] && array[i] % 2 == 0){
                    if(!isThereOurNum(duplicate, array[i])){
                        duplicate[startIndex++] = array[i];
                        break;
                    }
                }
            }
        }
        int[] result = Arrays.copyOfRange(duplicate, 0, startIndex);
        System.out.println(Arrays.toString(result));
    }
    static boolean isThereOurNum (int[] array, int num) {
        for (int i : array)
            if (i == num)
                return true;
        return false;
    }
}