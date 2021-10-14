package ComputeVAT;

public class Controller extends Main {


    public static void runController() {

        double userIn = Dialog.doDiag();
        double moms = CalculateVat.doVAT(userIn);
        View.doView(moms,MSG);
    }
}
