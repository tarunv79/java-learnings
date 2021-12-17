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
public class Amazon1 {
    public static void main(String[] args) {
        String s = "(())";

        char[] input = s.toCharArray();

        int out = 0;
        int pointer = 0;
        while(pointer<input.length){
            out += s2(input,pointer);
            pointer+=1;
        }
        System.out.println(out);
    }

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