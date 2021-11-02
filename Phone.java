package Phones;

public class Phone {
    private String IMEI;
    private String model;
    private String number;

    public Phone(String IMEI, String model) {
        this.IMEI = IMEI;
        this.model = model;
        this.number = "";
    }

    public void RegisterNom(Network name) {
        this.number = name.GetFreeNumber(this);
        if (this.number.equals("")) {
            System.out.println(this.model + ", IMEI " + this.IMEI +
                    " can not be registered: no more free numbers");
        }
        else {
            System.out.println(this.model + ", IMEI " + this.IMEI +
                    " was registered: new number - " + this.number);
        }
    }

    public void OutgoingDial (Network name, String nom) {
        System.out.println(this.model + ": Dialing " + nom + "...");
        if (this.number.equals("")) {
            System.out.println(this.model + ", IMEI " + this.IMEI +
                    " has not registered");
        }
        else {
            System.out.println(name.call(this.number, nom));
        }
    }

    public String IncomingDial (String nom) {
        return  (this.model + ": Incoming dial from " + nom);
    }
}
