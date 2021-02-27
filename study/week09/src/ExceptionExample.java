package week09.src;

import week09.src.exception.CustomException;

public class ExceptionExample {

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();

        example.tryCatch();
//        example.customException();
//
//        try {
//            example.customException2();
//        } catch (Exception e) {
//            System.out.println("예외처리");
//        }


    }

    public void customException() {
        String myName = "hJJANG";

        try {
            if(!myName.equals("hJ")) {
                throw new CustomException("이름이 hJJANG이 아닙니다.");
            }
        }catch (CustomException e){
            System.out.println("에외발생!!!");
        }
    }

    public void customException2() throws CustomException {
        String myName = "hJJANG";

        if(myName.equals("xxxx")) {
            throw new CustomException("잘못된 이름");
        }

    }

    public void tryCatch() {
        try {
            System.out.println("Try1");
            try {
                System.out.println("InnerTry");
                throw new Exception("InnerException");
            }catch (Exception e) {
                System.out.println("Inner Catch!");
            }
        } catch (Exception e) {
            System.out.println("OuterCatch");
        } finally {
            System.out.println("Final!");
        }
    }
}
