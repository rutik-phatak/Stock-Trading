package abc;

import java.util.ArrayList;
import java.util.List;

class MarketData {
    private List<Stock> stocks;

    public MarketData() {
        this.stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void updateStockPrice(String symbol, double newPrice) {
        for (Stock stock : stocks) {
            if (stock.getSymbol().equals(symbol)) {
                stock.setPrice(newPrice);
                return;
            }
        }
    }

    public void printMarketData() {
        for (Stock stock : stocks) {
            System.out.println("Stock: " + stock.getSymbol() + ", Price: " + stock.getPrice() + ", Change: " + (stock.getPrice() - stock.getPreviousPrice()));
        }
    }
}

