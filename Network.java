package Phones;

public class Network {
    private PhoneNumbers[] Numbers;
    private final String[] phn = { "0504657655", "0501234567", "0508364574" };

    public Network() {
        Numbers = new PhoneNumbers[phn.length];
        for (int i = 0; i < phn.length; i++) {
            Numbers[i] = new PhoneNumbers(phn[i]);
        }
    }

    public String GetFreeNumber (Phone imei) {
        for (int i = 0; i < phn.length; i++) {
            if (Numbers[i].isFree()) {
                Numbers[i].setUsed(imei);
                Numbers[i].used = true;
                return Numbers[i].getNom();
            }
        }
        return ("");
    }

    public String call (String from, String to) {
        if (from != null && from.equals(to)) {
            return ("Bip-bip-bip...");
        }
        int i = 0;
        while (i < phn.length) {
            if (Numbers[i].used && Numbers[i].nom.equals(to)) {
                System.out.println (Numbers[i].IMEI.IncomingDial(from));
                return ("Hello!");
            }
            i++;
        }
        return ("Unknown number " + to);
    }

    private static class PhoneNumbers {
        private String nom;
        private boolean used;
        private Phone IMEI;

        public PhoneNumbers(String nom) {
            this.nom = nom;
            this.used = false;
            this.IMEI = null;
        }

        public String getNom() {
            return nom;
        }

        public void setUsed(Phone imei) {
            this.IMEI = imei;
        }

        public boolean isFree() {
            return !(this.used);
        }
    }
}
