public class FinancialForecastTest {

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue =
                FinancialForecast.predictFutureValue(
                        currentValue,
                        growthRate,
                        years);

        System.out.printf(
                "Predicted Value after %d years = Rs.%.2f%n",
                years,
                futureValue);
    }
}