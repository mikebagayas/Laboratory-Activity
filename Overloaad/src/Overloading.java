public abstract class Overloading {

    static int sum2(int num1, int num2) {
        return num1 + num2;
    }
    static int sum3(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        int Num1 = sum2(50,100);
        int Num2 = sum3(75,20,30);

        System.out.println("Hello, World!");
        System.out.println("The sum of two numbers are: "+Num1);
        System.out.println("The sum of two number are: "+Num2);

        greaterValue Int = new greaterValue(45, 100);
        greaterValue Dou = new greaterValue(3.14, 9.8);

        if(Int.x > Int.y) {
            System.out.println("The greater value between 45 and 100 is " + Int.x);
        }else if(Int.x < Int.y) {
            System.out.println("The greater value between 45 and 100 is " + Int.y);
        }

        if(Dou.a > Dou.b) {
            System.out.println("The greater value between 3.14 and 9.8 is " +Dou.a);
        }else if(Dou.a < Dou.b) {
            System.out.println("The greater value between 3.14 and 9.8 is " +Dou.b);
        }
    }


}
