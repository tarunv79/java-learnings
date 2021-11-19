package com.mywork.spring;

import java.util.*;

public class MyApp {
    public static void main(String[] args) {
/*        String str = "Product[0].PreferredPrimary";

        System.out.println(str.indexOf("["));
        System.out.println(str.indexOf("]."));
        System.out.println(str.substring(str.indexOf("[")+1,str.indexOf("].")));*/

       /* String bw = "abc";

        Float fl = Float.parseFloat(bw);
        DecimalFormat df = new DecimalFormat("0.00");
        df.setMaximumFractionDigits(2);
        String val = df.format(fl);
        System.out.println(val);*/

        Map<String, String> attMap = new HashMap<String, String>();

        attMap.put("bw", "10");
        attMap.put("old_bw", "10");

        attMap.put("ip1", "1");
        attMap.put("old_ip1", "1");
        attMap.put("ip2", "2");
        attMap.put("old_ip2", "2");
        attMap.put("ip3", "4");
        attMap.put("old_ip333", "4");

        //String [] params = {"bw","old_bw"};

        String[] params = {"ip3", "old_ip3", "OR", "ip1", "old_ip1", "OR", "ip2", "old_ip2"};
        Collections.reverse(Arrays.asList(params));
        boolean result = false;
        result = getComparisonResult2(Arrays.asList(params), attMap, params.length, result);

        System.out.println("result is :" + result);

        //System.out.println(String.join(",",params));
    }


    public static boolean getComparisonResult2(List<String> params, Map<String, String> attMap,int length, boolean result) {
        String operator = null;
        while (length > 1 && params.get(length - 1) != null && params.get(length - 2) != null) {

            String val1 = attMap.get(params.get(length - 1));
            String val2 = attMap.get(params.get(length - 2));
            System.out.println("execute " + params.get(length - 1) + " != " + params.get(length - 2));
            System.out.println("As " + val1 + " != " + val2);
            System.out.println();
            if (val1 != null && val2 != null) {
                if (operator != null) {
                    if ("OR".equals(operator)) {
                        System.out.println("Operation OR");
                        result = result || !val1.equals(val2);
                    } else if ("AND".equals(operator)) {
                        result = result && !val1.equals(val2);
                        System.out.println("Operation AND");
                    }
                }else {
                    result = !val1.equals(val2);
                }
            }
            if(length>2){
                operator = params.get(length-3);
                length--;
            }
            length-=2;
        }

        return result;
    }


    public static boolean getComparisonResult(List<String> params, Map<String, String> attMap, int length, boolean result) {
        if (length > 1 && params.get(length - 1) != null && params.get(length - 2) != null) {
            String val1 = attMap.get(params.get(length - 1));
            String val2 = attMap.get(params.get(length - 2));

            System.out.println("execute " + params.get(length - 1) + " != " + params.get(length - 2));
            System.out.println("As " + val1 + " != " + val2);
            System.out.println();
            if (length > 2) {
                String operator = params.get(length - 3);
                if ("OR".equals(operator)) {
                    System.out.println("Operation OR");
                    result = result || !val1.equals(val2);
                } else if ("AND".equals(operator)) {
                    result = result && !val1.equals(val2);
                    System.out.println("Operation AND");
                } else {
                    result = !val1.equals(val2);
                }
                getComparisonResult(params, attMap, length - 3, result);
            } else {
                result = !val1.equals(val2);
            }
        }
        return result;
    }
}

