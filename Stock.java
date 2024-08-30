package abc;

import java.util.ArrayList;
import java.util.List;

class Stock {
    private String symbol;
    private double price;
    private double previousPrice;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        this.previousPrice = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.previousPrice = this.price;
        this.price = price;
    }

    public double getPreviousPrice() {
        return previousPrice;
    }
}
