public class Basic {
    public static void main(String[] args) {
        int[] inta = new int[]{1,4,2,5};
        int len = 5;
        int[] i = new int[len];
        i = new int[]{1, 2, 3, 4, 2};

        char[] c = new char[]{'a','1','-','!','@','#','$','%','/','=','\'','\"'};
        for (char a:c ) {
            System.out.println(a);
        }

        System.out.println('\'');//outputs '
        System.out.println("/");//outputs /

        //how to print quotes - make use of back-slash before the special char
        System.out.println("print \"this\" in quotes");
        //how to print back slash
        System.out.println('\\');


        //for loop without action
        for(int k = 50; k<21;){

        }
        //for loop with only condition
        int k = 10;
        for(;k>13;){}


        System.out.println(k>>1);
        System.out.println(k<<1);

        //assignment operator >>= and <<=
        //x >>= 3  i.e. x = x >> 3
        char set[] = {'a', 'b', 'c'};
        printSubsets(set);

        String s = 5 + "?";
        System.out.println(s);

        if(new Basic() instanceof Cloneable){
        }

        /*
          ASCII Table
        0 -> 48
        A -> 65
        a -> 97
         */
        System.out.println("converting chars ASCII::");
        char c1 = 'c';
        char c2 = (char) ('A' - 'a' + c1);
        System.out.println(c2);
        char c3 = (char) ('a' - 'A' + c2);
        System.out.println(c3);
    }

    static void printSubsets(char set[])
    {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++)

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");

            System.out.println("}");
        }
    }
}
/*
Output:
a
1
-
!
@
#
$
%
/
=
'
"
'
/
print "this" in quotes
\
5
20
{ }
{ a }
{ b }
{ a b }
{ c }
{ a c }
{ b c }
{ a b c }
5?
converting chars ASCII::
C
c
 */
