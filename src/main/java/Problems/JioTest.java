package Problems;

public class JioTest {

    public static void main(String[] args) {

        int[] a1 = new int[]{2,3,4,6,2,8};
        int[] a2 = new int[]{23,43,56,23,23};

        int min = a1[0];
        int max = min;

        int i = a1.length;
        int j = a2.length;

        int m = Math.max(i,j);

        for(int k = 0; k<m ; k++){

            if(k<i){
                if(a1[k]<min){
                    min = a1[k];
                }
                if(a1[k]>max){
                    max = a1[k];
                }
            }
            if(k<j){
                if(a2[k]<min){
                    min = a2[k];
                }
                if(a2[k]>max){
                    max = a2[k];
                }
            }


        }

        System.out.println("Min = "+min +" Max = "+max);




        float num = 92;

        float grade = getGrade(num);

        System.out.println("Grade = "+grade);


        //ExecutorService executorService = Executors.newFixedThreadPool(1);
        //Problems.MyThread t1 = new Problems.MyThread();
        //executorService.submit(t1);



        //executorService.

        //Problems.MyThread t1 = new Problems.MyThread();
        //System.out.println("this is from main method= "+Thread.currentThread().getName() +" ID ="+Thread.currentThread().getId());

        //t1.start();

    }

    private static float getGrade(float num) {

        if(num>0)
            return num/10;
        return 0;
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        //System.out.println("I'm in thread class "+this.getName());
        //System.out.println(this.getId());

        try {
            System.out.println("in side Problems.MyThread class " + Thread.currentThread().getName());
            throw new MyExceptionClass("throw exception");
        }catch (MyExceptionClass e){

        }



        //System.out.println("I'm running in thread class!!");
    }
}
