class Simplecalculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        char op = '+';   
        if(op=='+'){
            System.out.println("Addition: " + (a + b));
        } else if (op == '-') {
            System.out.println("Subtraction: " + (a - b));
        } else if (op == '*') {
            System.out.println("Multiplication: " + (a * b));
        } else if (op == '/') {
            System.out.println("Division: " + (a/b));
        } else {
            System.out.println("Invalid operator!");
        }
    }
}