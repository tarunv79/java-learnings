package Problems;

/*
	- Program to find the output
            ○ Given a string of parenthesis - ()()(()(()(())))
            ○ Find output as - () -> A, A+A = 1, AA = 2,

            ()() -> 1+1 = 2
            (()) -> 1*2 = 2
            ()()(()())
            (((())))
*/
public class Amaz1 {
    public static void main(String[] args) {
        String s = "(())";

        char[] input = s.toCharArray();

        int out = 0;
        int pointer = 0;
        out = calculate(input,pointer);
        System.out.println(out);
    }

    // ( ) ( ( ( ) ) )
    // 0 1 2 3 4 5 6 7
    /*
            () -> 1
            (1) -> 2
            (2) -> 4
            () + 4 -> 5


         cal(in,0) = 1+ cal(in,2)
         cal(in,2) = 1+ cal(in,2)
         cal(in,2) = 2* cal(in,3)
         cal(in,3) = 1+ cal(in,5)
         cal(in,5) = 1+ cal(in,7)
         cal(in,7) = 1
     */
    //( ) ( ( ) ( ) )
    //0 1 2 3 4 5 6 7
    //( ) ( ( ) ) ( )
    //0 1 2 3 4 5 6 7

    private static int calculate(char[] in, int pointer){
        System.out.println("cal-> in , "+pointer);
        if(pointer>=in.length-2){
            return 1;
        }
        if(in[pointer]=='(' && in[pointer+1]==')') {
            System.out.println("    -> condition ( && )");
            if(pointer<=in.length-2)
                return 1 + calculate(in, pointer+2);
            else
                return 0;
        }
        else if (in[pointer]=='(' && in[pointer+1]=='('){
            System.out.println("    -> condition ( && (");
            return 2 * calculate(in,pointer+1);
        } else {
            System.out.println("    -> else condition");
            return calculate(in,pointer+1);
        }

    }
   /* private static int calculate(char[] in, int pointer){
        System.out.println("cal-> in , "+pointer);
        if(in.length==2){
            return 1;
        }
        if(pointer>=in.length-2){
            return 0;
        }
        if(in[pointer]=='(' && in[pointer+1]==')') {
            System.out.println("    -> condition ( && )");
            if(pointer<=in.length-2)
                return 1 + calculate(in, pointer+2);
            else
                return 0;
        }
        else if (in[pointer]=='(' && in[pointer+1]=='('){
            System.out.println("    -> condition ( && (");
            return 2 * calculate(in,pointer+1);
        } else {
            System.out.println("    -> else condition");
            return calculate(in,pointer+1);
        }

    }*/


    //case A+A ()()()
    private static int s1(char[] input, int pointer){
        System.out.println("S1 invoked");
        if(pointer==input.length-1)
            return 0;
        if(input[pointer]=='('&& input[pointer+1]==')') {
            pointer+=2;
            return 1;
        }
        else return 0;
    }

    //A*A  (())
    private static int s2(char[] input, int pointer){
        System.out.println("S2 invoked, pointer " +pointer);

        if(input[pointer]=='(' && input[pointer+1]!=')') {
            return 2*s2(input, pointer+1);
        }else if(input[pointer]=='('&& input[++pointer]==')') {
            return 1;
        }
        else {
            return 0;
        }
    }



    private static int search(char[] input, int pointer){
        if(input[pointer]==')'){
            return 1;
        }else if(input[pointer]=='('){
            return 1 + search(input,pointer+1);
        }
        else {
            return 2*search(input,pointer);
        }
    }

}
/*
()(()())
search   ()(()) , 0

 */