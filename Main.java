package Phones;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("R45TF7R", "Nokia 1100");
        Phone p2 = new Phone("K131G8D", "LG V90");
        Phone p3 = new Phone("R85TJ74", "Nokia 3210");
        Phone p4 = new Phone("L561G1D", "Lenovo K6");

        Network MTS = new Network();

        p1.RegisterNom(MTS);
        p2.RegisterNom(MTS);

        p1.OutgoingDial(MTS, "0501234567");
        p2.OutgoingDial(MTS, "0508364574");
    }
}
