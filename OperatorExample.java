class OperatorExample {
    public static void main(String[] args) {
        int a = 10, b = 5;

        //Arithmetic Operations
        System.out.println("Additon: " + (a + b));
        System.out.println("Subtration: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: "+ (a / b));
        System.out.println("Mode: "+ (a % b));

        //Relational operators
        System.out.println("a>b: "+(a>b));
        System.out.println("a==b: "+(a==b));   //a=10,b="10"; a==b is true becoz they only check the value
                                               //if it is a===b then it is false becoz they check  including datatype 

        //Logical Operators
        System.out.println("(a>b)&&(a<20):"+((a>b)&&(a<20)));

        //Assignment Operator
        a+=5;
        System.out.println("After+= :"+a);

        //Increamental operation
        a++;
        System.out.println("After increment:"+a);


    }
}
