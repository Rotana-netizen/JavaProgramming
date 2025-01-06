

public class CalculateElectricity{
    public static void main(String[] args) {
       System.out.println("Total price : " +getTotalPrice(100,550,1000));
    }
    static double getTotalPrice( int old_number, int new_number,int priceperkw){
        double totalprice = 0;
        int totalec = new_number - old_number;


        totalprice = totalec * priceperkw;
        return totalprice;
    }
    
}