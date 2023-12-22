class Main {
  public static void main(String[] args) {
    // Arithmetic operater
    int a = 12, b = 5;

    System.out.println("a + b = " + (a + b));

    System.out.println("a - b = " + (a - b));

    System.out.println("a * b = " + (a * b));

    System.out.println("a / b = " + (a / b));

    System.out.println("a % b = " + (a % b));


    // Assignment operator
    int z = 4;
    int var;

    var = z;
    System.out.println("var using =: " + var);

    var += z;
    System.out.println("var using +=: " + var);

    var *= z;
    System.out.println("var using *=: " + var);

    
    // Relational operator
    System.out.println("a is " + a + " and b is " + b);

    System.out.println(a == b);  

    System.out.println(a != b);  

    System.out.println(a > b);  

    System.out.println(a < b); 

    System.out.println(a >= b); 

    System.out.println(a <= b);  


    // Logical operator
    System.out.println((5 > 3) && (8 > 5));  
    System.out.println((5 > 3) && (8 < 5));  

    System.out.println((5 < 3) || (8 > 5));  
    System.out.println((5 > 3) || (8 < 5));  
    System.out.println((5 < 3) || (8 < 5));  

    System.out.println(!(5 == 3));  
    System.out.println(!(5 > 3)); 

    // Shift operator
    System.out.println("a << 1 = " + (a <<1));

    System.out.println("a >> 1 = " + (a >> 1));

    // Bitwise operator

     System.out.println("a&b = " + (a & b));
 
        System.out.println("a|b = " + (a | b));
 
        System.out.println("a^b = " + (a ^ b));
 
        System.out.println("~a = " + ~a);
 
        a &= b;
        System.out.println("a= " + a);


}
}

