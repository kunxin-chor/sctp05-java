package M18_ProductManagement;

public class Utility {
    private static double GST_PERCENTAGE  = 0.09;
    public static double calculateGST(double original) {
        return original * GST_PERCENTAGE;

    }
}
