package week03.examplesrc;

public class Oper {

    public static void main(String[] args) {
        Oper oper = new Oper();
        oper.operatior();
        oper.divideExample();
//        oper.exceptionOper();
        oper.divOpnd();
        oper.ampOpnd();
    }

    public void operatior() {
        System.out.println("======================================================");
        int firstNum = 12;
        int secondNum = 4;

        System.out.println(firstNum + " + " + secondNum + " = "+ (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = "+ (firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = "+ (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = "+ (firstNum / secondNum));
        System.out.println(firstNum + " % " + secondNum + " = "+ (firstNum % secondNum));
    }
    public void divideExample() {
        System.out.println("======================================================");
        int firstNum = 12;
        int secondNum = 5;
        System.out.println(firstNum + " % " + secondNum + " = "+ (firstNum % secondNum));
    }
    public void exceptionOper() {
        System.out.println("======================================================");
        int firstNum = 12;
        int secondNum = 0;
        System.out.println(firstNum + " / " + secondNum + " = "+ (firstNum / secondNum));
    }

    public void divOpnd() {
        System.out.println("======================================================");
        int intVal1 = 9;
        int intVal2 = 4;
        float floatVal1 = 9.0f;
        float floatVal2 = 4.0f;
        System.out.println(intVal1 + " / " + intVal2 + " = "+ (intVal1 / intVal2));
        System.out.println(floatVal1 + " / " + floatVal2 + " = "+ (floatVal1 / floatVal2));
        System.out.println("(float) "+intVal1 + " / " + intVal2 + " = "+ ((float) intVal1 / intVal2));
    }

    public void ampOpnd() {
        System.out.println("======================================================");
        int intVal1 = 7;
        int intVal2 = 3;
        float floatVal1 = 7.2f;
        float floatVal2 = 2.0f;
        System.out.println(intVal1 + " % " + intVal2 + " = "+ (intVal1 % intVal2));
        System.out.println(floatVal1 + " % " + floatVal2 + " = "+ (floatVal1 % floatVal2));
    }
}
