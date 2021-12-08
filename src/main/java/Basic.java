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

    }
}
