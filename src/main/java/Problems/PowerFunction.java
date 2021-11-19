package Problems;

public class PowerFunction {
    public static void main(String[] args) {
        //System.out.println(power1(16,1));

        Power power = new Power();
        System.out.println(power.power(2,1));
        System.out.println(power.power(2,2));
        System.out.println(power.power(2,3));
        System.out.println(power.power(2,4));
        System.out.println(power.power(2,5));

        System.out.println(power.power(3,4));
        System.out.println(power.power(5,3));
        System.out.println(power.power(2,8));
        System.out.println(power.power(1,1));
        System.out.println(power.power(6,0));


        System.out.println("Double..");
        System.out.println(power.powerD(2.0,5.0));
        System.out.println(power.powerD(2.2,1));




    }

    public static int power1(int a, int n){
        if(n==1){
            return a;
        }
        return a*power1(a,n-1);
    }



    static class Power {
        public int power(int a , int n){
            if(n==0)
                return 1;
            if(n==1){
                return a;
            }
            if(n%2==0)
                return power(a*a,n/2);
            else
                return a*power(a*a,n/2);
        }


        public double powerD(double a , double n){
            if(n==0)
                return 1;
            if(n==1){
                return a;
            }
            if(n%2==0)
                return powerD(a*a,n/2);
            else
                return a*powerD(a*a,n/2);
        }
    }
}

