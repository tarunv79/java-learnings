package Problems;


/*
For example, if n = 5 and k = 2, then the safe position is 3.
Firstly, the person at position 2 is killed, then person at position 4 is killed,
then person at position 1 is killed. Finally, the person at position 5 is killed.
So the person at position 3 survives.
If n = 7 and k = 3, then the safe position is 4.
The persons at positions 3, 6, 2, 7, 5, 1 are killed in order,
and person at position 4 survives.
 */
public class Josepheus {

    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        System.out.println(josepheus(n,k));
    }

    private static int josepheus(int n, int k) {
        if(n==1)
            return 1;
        return (josepheus(n-1,k) + k -1 )%n +1;
    }


}
