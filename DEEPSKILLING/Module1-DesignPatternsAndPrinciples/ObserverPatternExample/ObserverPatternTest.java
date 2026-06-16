public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Bhavani");
        Observer webUser = new WebApp("Darani");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice("TCS", 4200.50);

        System.out.println();

        stockMarket.setStockPrice("Infosys", 1650.75);
    }
}