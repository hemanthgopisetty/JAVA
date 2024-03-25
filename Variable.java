/**
 * 
 * variable is a named memory location that may be assigned a value by your program
 * The value of a variable may be changed during the execution of the program
 * declaration type varname
 * If you want to declare more than one variable of the specified type, 
 * you may use a comma-separated list of variable names
 * Java defines several data types, including integer, character, and floating-point. 
 * 
 */
class Variable {

    public static void main(String[] args)
    {
        int num ;//declaration of a variable
        num =-100;//this assigns a varaible
        System.out.println("This is num " + num);//In this statement, the plus sign causes the value of num to be appended to the string that precedes it, and then the resulting string is output.
        //Actually, num is first converted from an integer into its string equivalent and then concatenated with the string that precedes it.

        num = num * 2;
        System.out.print("The value of num * 2 is "); //The print( ) method is just like println( ), except that it does not output a newline character after each call.
        System.out.println(num);

    }
}