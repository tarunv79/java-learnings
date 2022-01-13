package Problems;

//given a string in format my_code_name (format of c), convert it in the form myCodeName (format of java)

public class ConstantFormatConversion {

    /*
    ASCII Table
        0 -> 48
        A -> 65
        a -> 97

        c -> C
        c - a
     */

    public static void main(String[] args) {
        String in = "my_code___name_";

        System.out.println(convert2(in));
    }

    // Space O(n), Time O(n), better approach
    private static String convert2(String s){
        StringBuilder sb = new StringBuilder();
        int i =0;
        boolean _indicator = false;
        for(i=0; i<s.length(); i++){
            if(s.charAt(i) == '_'){
                _indicator = true;
            }else if(_indicator){
                char c = (char) ('A' - 'a' + s.charAt(i));
                sb.append(c);
                _indicator = false;
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    private static String convert(String s){

        StringBuilder sb = new StringBuilder();
        int i =0;
        for(i=0; i<s.length()-1; i++){
            if(s.charAt(i) == '_'){
                char c = (char) ('A' - 'a' + s.charAt(i+1));
                sb.append(c);
                i++;
            }else {
                sb.append(s.charAt(i));
            }
        }
        if(s.charAt(i)!='_')
            sb.append(s.charAt(i));
        return sb.toString();
    }
}
