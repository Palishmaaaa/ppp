public class FixedDepositNIB {
    public static void main(String[] args) {

        double feeRate = 0.005;     // 0.5% processing fee
        int rate = 8;               // starting rate

        while (rate <= 12) {

            double P = 1000;        // minimum deposit
            int years = 5;          // max duration
            int months = years * 12;

            double monthlyRate = (rate / 100.0) / 12.0;
            double A = P * Math.pow(1 + monthlyRate, months);

            double fee = A * feeRate;
            double finalAmt = A - fee;

            System.out.println("\n--- FD DETAILS FOR " + rate + "% ---");
            System.out.println("Principal: Rs. " + P);
            System.out.println("Annual Rate: " + rate + "%");
            System.out.println("Monthly Rate: " + monthlyRate);
            System.out.println("Duration: " + years + " years (" + months + " months)");
            System.out.println("Maturity Amount: Rs. " + String.format("%.2f", A));
            System.out.println("Processing Fee (0.5%): Rs. " + String.format("%.2f", fee));
            System.out.println("Final Amount: Rs. " + String.format("%.2f", finalAmt));

            rate++;
        }
    }
}
  