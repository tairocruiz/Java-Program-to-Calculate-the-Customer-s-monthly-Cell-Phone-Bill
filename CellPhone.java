import java.util.Scanner;

public class CellPhone{
   
    // 1 min = 8.695652
    private int  peakMin;
    private int  nightMin;
    private double package_bill = 10000.00;
    
    public CellPhone(int pMin, int nMin)
    {
        this.peakMin = pMin;
        this.nightMin = nMin;
    }

    public int getPeakMin(){
        return this.peakMin;
    }

    public int getNightMin(){
        return this.nightMin;
    }


    public double getBill(){
        if(peakMin > 400 || nightMin > 750){
            if(peakMin > 400){
                this.package_bill += (peakMin-400)*150;
            }
            if(nightMin > 750){
                this.package_bill += (nightMin-750)*150;
            }
        }
        
        return this.package_bill;
    }

    public static void main(String[] args)   
    {  
        int dayCall, nightCall;
        double matumiz;
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter peak Min : ");
            dayCall = input.nextInt();
            System.out.print("Enter Night Min : ");
            nightCall = input.nextInt();
        }
        CellPhone objcPhone = new CellPhone(dayCall, nightCall);
        matumiz = objcPhone.getBill();
        
        System.out.print("The Monthly phone call bill is : Tsh. " + matumiz + "/=");
        
    }  
}
