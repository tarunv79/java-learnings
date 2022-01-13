

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

        byte b = 0x01;
        b = 0x02;
        System.out.println(b);
        //outputs 2
        System.out.println(b>>1);
        //outputs 1
        System.out.println(b<<1);
        //outputs 4
        System.out.println(b<<1);
        //outputs 4
        System.out.println(b<<1);
        //outputs 4
        System.out.println(b<<2);
        //outputs 8

        int b1 = 1;

        System.out.println(b1);
        System.out.println(b1<<1);
        System.out.println(b1<<2);
        System.out.println(b1<<3);
        System.out.println(b1<<4);
        System.out.println(b1<<5);
        System.out.println(b1<<10);

        byte b2 = 0x01;
        System.out.println(b2>>1);
        //outputs 0;
        System.out.println(b2>>2);
        //outputs 0;

        System.out.println("printing subset com..");

        for (int i1 =0; i1<10; i1++){
            System.out.println(1<<3);
        }
        System.out.println("2 to the power 3 is-");
        //below is bitwise OR operator
        System.out.println(2^3);
        //outputs 1
        System.out.println(2^4);
        //outputs 6

        System.out.println(1&2);
        //outputs 1
        System.out.println(1&3);
        //outputs 0
    }
/*
2^n = 4 times loop
length of bits/chars in each iteration will remain as n = 2

00 -> {}
01 -> {b}
10 -> {a}
11 -> {ab}

i = 3 -> 11 ->

((i & (1 << j)) > 0)

i = 00,   j = 01 -> 00
	  	, j = 10 -> 00

i = 01,   j = 01 -> 01
		, j = 10 -> 00

i = 10,   j = 01 -> 00
		, j = 10 -> 10

i = 11,   j = 01 -> 01
		, j = 10 -> 10
 */
    static void printSubsets(char set[])
    {
        int n = set.length;

        // Run a loop for printing all 2^n
        //1<<n will return the value on 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++) {
                //System.out.println(" i = "+i +" ,j = "+j);

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                /*

                 */
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
            }
            System.out.println("}");
        }


    }
}
/*
"C:\Program Files\Java\jdk1.8.0_151\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.1\lib\idea_rt.jar=1832:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_151\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_151\jre\lib\rt.jar;C:\WS\MyUtils\ExperimentalUtils\target\classes;C:\Users\tarunvi\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.11.3\jackson-databind-2.11.3.jar;C:\Users\tarunvi\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.11.3\jackson-core-2.11.3.jar;C:\Users\tarunvi\.m2\repository\com\fasterxml\jackson\dataformat\jackson-dataformat-xml\2.11.1\jackson-dataformat-xml-2.11.1.jar;C:\Users\tarunvi\.m2\repository\com\fasterxml\jackson\module\jackson-module-jaxb-annotations\2.11.1\jackson-module-jaxb-annotations-2.11.1.jar;C:\Users\tarunvi\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\2.3.2\jakarta.xml.bind-api-2.3.2.jar;C:\Users\tarunvi\.m2\repository\jakarta\activation\jakarta.activation-api\1.2.1\jakarta.activation-api-1.2.1.jar;C:\Users\tarunvi\.m2\repository\org\codehaus\woodstox\stax2-api\4.2.1\stax2-api-4.2.1.jar;C:\Users\tarunvi\.m2\repository\com\fasterxml\woodstox\woodstox-core\6.2.1\woodstox-core-6.2.1.jar;C:\Users\tarunvi\.m2\repository\com\google\code\gson\gson\2.8.6\gson-2.8.6.jar;C:\Users\tarunvi\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.11.3\jackson-annotations-2.11.3.jar;C:\Users\tarunvi\.m2\repository\com\fasterxml\jackson\jaxrs\jackson-jaxrs-xml-provider\2.9.8\jackson-jaxrs-xml-provider-2.9.8.jar;C:\Users\tarunvi\.m2\repository\com\fasterxml\jackson\jaxrs\jackson-jaxrs-base\2.9.8\jackson-jaxrs-base-2.9.8.jar;C:\Users\tarunvi\.m2\repository\org\codehaus\woodstox\woodstox-core-asl\4.4.1\woodstox-core-asl-4.4.1.jar;C:\Users\tarunvi\.m2\repository\javax\xml\stream\stax-api\1.0-2\stax-api-1.0-2.jar;C:\Users\tarunvi\.m2\repository\io\cucumber\datatable-dependencies\1.1.12\datatable-dependencies-1.1.12.jar" Basic
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
2
1
4
4
4
8
1
2
4
8
16
32
1024
0
0
printing subset com..
8
8
8
8
8
8
8
8
8
8
2 to the power 3 is-
1
6
0
1

Process finished with exit code 0

 */
