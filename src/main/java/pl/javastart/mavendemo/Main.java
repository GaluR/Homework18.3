package pl.javastart.mavendemo;

import pl.javastart.mavendemo.service.EulerService;

public class Main {
    public static void main(String[] args) {
        EulerService euler6Service = new EulerService();
        System.out.println(euler6Service.subtractionOfSquares(100));
    }

}
