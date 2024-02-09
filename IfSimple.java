 class IfSimple {
    public static void main(String[] args) {
        int x,y;
        x=10;
        y=20;
        if(x<y)System.out.println("x is less than y");
        x=x*2;
        if(x == y)System.out.println("x now is equal to y");
        x = x * 2;
        if(x > y) System.out.println("x now greater than y");
        if(x == y) System.out.println("you won't see this");
    }
}
/*
 * if statement works much like the IF statement in any other language
 * It determines the flow of execution based on whether some condition is true or false. 
 * if(condition) statement;
 * condition is a Boolean expression
 * If condition is true, then the statement is executed. If condition is false, then the statement is bypassed. 
 * if(num < 100) System.out.println("num is less than 100");
 * if num contains a value that is less than 100, the conditional expression is true, and println( ) will execute. If num contains a value greater than or equal to 100, then the println( ) method is bypassed
 * 
 */