package abc;

public class StockTradingPlatform {
    private Portfolio portfolio;
    private MarketData marketData;

    public StockTradingPlatform() {
        this.portfolio = new Portfolio();
        this.marketData = new MarketData();
    }

    public void buyStock(Stock stock) {
        portfolio.addStock(stock);
        marketData.addStock(stock);
        System.out.println("Bought stock: " + stock.getSymbol() + ", Price: " + stock.getPrice());
    }

    public void sellStock(Stock stock) {
        portfolio.removeStock(stock);
        System.out.println("Sold stock: " + stock.getSymbol() + ", Price: " + stock.getPrice());
    }

    public void updateMarketData(String symbol, double newPrice) {
        marketData.updateStockPrice(symbol, newPrice);
    }

    public void printPortfolio() {
        portfolio.printPortfolio();
        System.out.println("Total Portfolio Value: " + portfolio.calculateTotalValue());
    }

    public void printMarketData() {
        marketData.printMarketData();
    }

    public static void main(String[] args) {
        StockTradingPlatform platform = new StockTradingPlatform();

        Stock stock1 = new Stock("AAPL", 100.0);
        Stock stock2 = new Stock("GOOG", 500.0);

        platform.buyStock(stock1);
        platform.buyStock(stock2);

        platform.printPortfolio();
        platform.printMarketData();

        platform.updateMarketData("AAPL", 120.0);
        platform.updateMarketData("GOOG", 550.0);

        platform.printPortfolio();
        platform.printMarketData();

        platform.sellStock(stock1);

        platform.printPortfolio();
        platform.printMarketData();
    }
}

