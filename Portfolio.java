package abc;

import java.util.ArrayList;
import java.util.List;

class Portfolio {
    private List<Stock> stocks;

    public Portfolio() {
        this.stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void removeStock(Stock stock) {
        stocks.remove(stock);
    }

    public void printPortfolio() {
        for (Stock stock : stocks) {
            System.out.println("Stock: " + stock.getSymbol() + ", Price: " + stock.getPrice());
        }
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getPrice();
        }
        return totalValue;
    }
}

