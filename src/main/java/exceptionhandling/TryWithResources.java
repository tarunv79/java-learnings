package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args)  {
        try(Scanner sc = new Scanner(new File("src/main/java/exceptionhandling/input.txt"));
            PrintWriter print = new PrintWriter(new File("src/main/java/exceptionhandling/output.txt"))
        ){
            while (sc.hasNext()){
                print.print(sc.next());
            }

        }catch (FileNotFoundException f){
            System.out.println("File not found exception occurred!! "+f.getMessage());
        }
    }
}
