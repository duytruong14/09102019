//Duy Truong
//First program
import java.util.Scanner;
import java.io.*;
public class Inclass {
public static void main(String[] args)throws IOException{
    //Ask user for a program name
    Scanner inp= new Scanner(System.in);
    String fname;
    System.out.println("Enter the file name that you want: ");
fname=inp.nextLine();
PrintWriter outfile= new PrintWriter(fname);

//Ask user for how many numbers to be in the file
int N;
    System.out.println("Enter how many number of data you want in the file:: ");
    N=inp.nextInt();
//put the number into the file
    int control=0;
    int file;
    while(control<N){
        System.out.println("Enter a number: ");
        file=inp.nextInt();
        outfile.println(file);
        control=control+1;
    }
    outfile.close();
}
}
