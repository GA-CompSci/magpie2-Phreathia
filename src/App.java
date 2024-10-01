public class App {
    public static void main(String[] args) throws Exception {
        // demonstrate the use of a function
        print("Hello World!");
        print("The sum of 5 and 3 is " + add(5, 3));
    
        // this is all a silly exercise to demonstrate the use of functions
        // here's the easy way to print the sum of 5 and 3
        System.out.println("The sum of 5 and 3 is " + (5+3));
        print();
    }
    // function to print a string
    public static void print(String str){
        System.out.println(str);
    }
    public static void print(){
        System.out.println("Thank you for your time.");
    }

    // function to add two numbers
    public static int add(int a, int b){
        return a + b; // return the sum of a and b
    }
}
