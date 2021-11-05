package phones;

public class Network {
    private PhoneNumber[] numbers;
    private final String[] simCardsPull = { "0504657655", "0501234567", "0508364574" };

    public Network() {
        numbers = new PhoneNumber[simCardsPull.length];
        for (int i = 0; i < simCardsPull.length; i++) {
            numbers[i] = new PhoneNumber(simCardsPull[i]);
        }
    }

    public String getFreeNumber(Phone imei) {
        for (int i = 0; i < simCardsPull.length; i++) {
            if (numbers[i].isFree()) {
                numbers[i].setUsed(imei);
                return numbers[i].getNom();
            }
        }
        return ("");
    }

    public String call (String from, String to) {
        if (from != null && from.equals(to)) {
            return ("Bip-bip-bip...");
        }
        int i = 0;
        while (i < simCardsPull.length) {
            if ((numbers[i].imei != null) && numbers[i].nom.equals(to)) {
                System.out.println (numbers[i].imei.incomingDial(from));
                return ("Hello!");
            }
            i++;
        }
        return ("Unknown number " + to);
    }

    private static class PhoneNumber {
        private String nom;
        private Phone imei;

        public PhoneNumber(String nom) {
            this.nom = nom;
            this.imei = null;
        }

        public String getNom() {
            return nom;
        }

        public void setUsed(Phone imei) { this.imei = imei; }

        public boolean isFree() {
            return (this.imei == null);
        }
    }
}
