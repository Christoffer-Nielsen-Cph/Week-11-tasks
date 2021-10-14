package ComputeVAT;

public class CalculateVat extends Main{

    public static double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
