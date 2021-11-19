package com.mywork.spring;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Test{
    public static void main(String[] args) {

        int A = 1;
        int B = 8;
        int C=3;
        int D=2;

        int hr = getNum(A,B);
        int min = getNum(C,D);

        int validHrs = 0;
        int validMins = 0;
        List<Integer> arr = Arrays.asList(A,B,C,D);
        arr = arr.stream().distinct().collect(Collectors.toList());

        List<Integer> temp = arr;
        for (Integer element : arr) {
            int x = element;
            List<Integer> remaining = temp.stream().filter(i-> x==i).collect(Collectors.toList());
            for (Integer rem : remaining) {
                int y = rem;
                if(getNum(x,y)<=24){

                    validHrs++;
                }
                if(getNum(x,y)<=60){
                    validMins++;
                }
            }
            temp=arr;
        }

        int output = validHrs*validMins;


        System.out.println(output);
       /* A , B , C , D

        A=0; B = 0-9; C
        A=1; B = 0-9;
        A=2; B = 0-4;*/



    }


    private static int getNum(int x, int y) {
        return (x*10)+y;
    }


    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 && A[n - 1] != K)
            return false;
        else
            return true;
    }


}

