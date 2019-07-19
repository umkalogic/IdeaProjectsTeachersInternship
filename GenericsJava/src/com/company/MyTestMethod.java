package com.company;
public class MyTestMethod {
    public static <T extends Number>
    int calcNum(T[] arrTest, T maxValue) {
       int sum = 0;
        for (T elem : arrTest) {
            if (elem.doubleValue() > maxValue.doubleValue()) {
                sum++;
            }
       }
       return sum;
    }
    public static <T extends Number>
    double sumElem(T[] arrTest, T maxValue) {
        double sum = 0.0;
        for (T elem : arrTest) {
            if (elem.doubleValue() > maxValue.doubleValue()) {
                sum+=elem.doubleValue();
            }
        }
        return sum;
    }
}
