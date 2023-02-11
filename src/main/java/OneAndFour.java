public class OneAndFour {


    public boolean oneFourNumbers(int[] arr){
        int one = 0;
        int four = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                one++;
            }else if (arr[i] == 4){
                four++;
            }else if (arr[i] != 4 && arr[i] != 1){
                temp++;
            }
        }

        if (temp > 0){
            return false;
        }
        if (one < 1 || four < 1){
            return false;
        }
        if (one >= 1 && four >= 1){
            return true;
        }
        return false;
    }
}

