
package CreatingObjectsPractical;


public class Stock {
    
    
    
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    
    public Stock(){
        
    }

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
    
    public double getChangePercent(){
    double changePercent=this.currentPrice-this.previousClosingPrice;
    double price_change_percentage=changePercent/this.previousClosingPrice/100;
      
        return price_change_percentage;
    }
    
    public String getStockSymbolAndName(){
        return (this.symbol + " " + this.name);
    }
 
}