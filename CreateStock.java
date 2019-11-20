
package CreatingObjectsPractical;
import java.util.Scanner;


public class CreateStock {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
       
        
        Stock stock = new Stock();
        
        System.out.print("Enter the symbol of the stock: ");
        String symbol=sc.nextLine();
        stock.setSymbol(symbol);
        
        System.out.print("Enter the name of the stock: ");
        String name=sc.nextLine();
        stock.setName(name);
        
        System.out.print("Enter the previous closing price of the stock: ");
        double previousClosingPrice=sc.nextDouble();
        stock.setPreviousClosingPrice(previousClosingPrice);
        
        System.out.print("Enter the current price of the stock: ");
        double currentPrice=sc.nextDouble();
        stock.setCurrentPrice(currentPrice);
        
        System.out.println("Stock details: " + stock.getStockSymbolAndName());
        System.out.println("Price-change percentage: " + stock.getChangePercent());
        
       
    }
    
}
