package com.ready2die;

public class StringCalculator {
    public static int add(String text) {
//        int result = 0;

        if (isBlank(text)) {
            return 0;
        }

//        else { // else 예약어를 사용하지 않는다.


        return sum(toInts(split(text)));
//            for (String value : values) {
////                result += Integer.parseInt(value); //들여쓰기 depth 가 2인 곳 refactoring
//            }
//        int[] numbers = toInts(values);
//        return sum(numbers);
//        }

//        return result;
    }

    public static String[] split(String text) {
       return text.split(",|:");
    }

    public static boolean isBlank(String text) {
        if (text == null || "".equals(text)) {
            return true;
        } else {
            return false;
        }
    }

    public static Positive[] toInts(String[] values) {
        Positive[] numbers = new Positive[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = new Positive(values[i]);
        }
        return numbers;
    }

    public static int toInt(String value) {
        int number = Integer.parseInt(value);
        if (number < 0) {
            throw new RuntimeException();
        }

        return number;
    }

    public static int sum(Positive[] numbers) {
        Positive result = new Positive(0);
        for (Positive number : numbers) {
           result = result.add(number);
        }
        return result.getNumber();
    }

    // Compose method pattern
    // 메소드(함수)의 의도가 잘 드러나도록 동등한 수준의 작업을 하는 여러 단계로 나눈다.

    //
}
