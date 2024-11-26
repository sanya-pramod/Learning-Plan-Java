public class Main {
  public static void main(String[] args) {
    // printing
    System.out.println("Hello World");
    System.out.println("I'm learning Java");

    // variables
    int num1 = 6;
    String str1 = "hello";
    System.out.println(num1 + str1);

    // datatypes
    int myNum = 5;               // Integer (whole number)
    float myFloatNum = 5.99f;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String
    double myDouble = 19.99d;     // Double

    //testing datatypes
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
    System.out.println(myDouble);

    // selectors
    int x = 1;
    if (x ==1){
      System.out.println(x*2);
    }

    // While loop
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);

  }
}