import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Prime {



    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //String n = in.nextLine();
        BigInteger n = in.nextBigInteger();
      
      System.out.println(n.isProbablePrime(1) ? "prime" :"not prime");
        in.close();
    }
    
}
