public class BmiService {
    public double calculate(double height, double weight) {
        double heightInMeters = height / 100;
        double index = weight / Math.pow(heightInMeters, 2);
        return Math.floor(index * 100) / 100;
    }
}
