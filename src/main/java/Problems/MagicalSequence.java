package Problems;

public class MagicalSequence {
    public static void main(String[] args) {
        System.out.println(calculateMagicalSeq(1234567890,10));
    }
    //1234567890
    private static int calculateMagicalSeq(int num, int d) {

        String str = String.valueOf(num);

        int count = 0;

        for (int i = d - 1; i >= 0; i--) {
              for (int j = i; j >= 0; j--) {
                String subStr = str.substring(j,i);
                if(isMagical(subStr))
                    count++;
            }
        }
        return count;

    }

    private static boolean isMagical(String subStr) {

        char[] arr = subStr.toCharArray();
        int sum = 0;
        for(int k = arr.length-2 ; k>=0 ; k-=2){

            char ch = arr[k];
            int intVal = ((int) ch);
            intVal = intVal*2;
            if(intVal/10>0){
                int a = intVal/10;
                int b = intVal%10;
                sum= sum+a+b;
            }else {
                sum = sum+intVal;
            }
        }
        for(int k = arr.length-1; k>=0; k-=2){
            char ch = arr[k];
            sum = sum + (int)ch;
        }

        if(sum!=0 && sum/10==0)
            return true;

        return false;

    }
}
