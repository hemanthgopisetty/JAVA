class Hello{
    public static void main(String[] args) //The program will start executing from this line
    //public, then that member may be accessed by code outside the class in which it is declared. 
    //(The opposite of public is private, which prevents a member from being used by code defined outside of its class.)
    //main( ) must be declared as public, since it must be called by code outside of its class when the program is started
    //The keyword static allows main( ) to be called 
    //without having to instantiate a particular instance of the class
    //This is necessary since main( ) is called by the Java Virtual Machine before any objects are made
    //The keyword void simply tells the compiler that main( ) does not return a value.
    //As stated, main( ) is the method called when a Java application begins
    //String[ ] args declares a parameter named args, which is an array of instances of the class String
    //All of the code that comprises a method will occur between the method’s opening curly brace and its closing curly brace.
    //main( ) is simply a starting place for your program

    //A complex program will have dozens of classes, only one of which will need to have a main( ) method to get things started. 
    
    {
        System.out.println("Hemanth");
        //Output is actually accomplished by the built-in println( ) method
        //In this case, println( ) displays the string which is passed to it.
        //System is a predefined class that provides access to the system, and out is the output stream that is connected to the console
        //Many statements in Java end with a semicolon
    }
}

//Name of the file Should be the Class Name
//Source File is called as Compilation Unit
//In Java all Code must reside inside a class
//By Convention the name of the main class should match the name of the that holds the progra,
//Java is case sensitive



//Compiling the program 
//javac FP.java
//javac compiler create a file called FP.class
//.class file contains bytecode version of the program
//Java bytecode is the intermediate representation of your program 
//that contains instructions the Java Virtual Machine will execute
//Thus, the output of javac is not code that can be directly executed.
//To actually run the program, you must use the Java application launcher called java
//java Example

//After creating a .class file if we made any change and compile with java fp
//it won't refelct any changes
//any modification in many source filee
//should produce bytecode again
//that bytecode should run again 
//to see the new update

/*
 * This is multicomment
 */

 //This is singel comment
 //Comments are ignored by the compiler
 
