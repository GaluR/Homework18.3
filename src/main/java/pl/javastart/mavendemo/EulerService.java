package pl.javastart.mavendemo;

public class EulerService {

    public int subtractionOfSquares(int a){
        int sumOfSquares = 0;
        int sum = 0;
        for (int i = 0; i <= a ; i++) {
            int result = i*i;
            sumOfSquares+= result;
        }
        for (int i = 0; i <= a ; i++) {
            sum+=i;
        }
        int squareOfSums = sum*sum;
        int subtraction = squareOfSums - sumOfSquares;
        return subtraction;
    }

}
