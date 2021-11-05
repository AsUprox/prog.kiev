package phones;

public class Phone {
    private String imei;
    private String model;
    private String number;

    public Phone(String imei, String model) {
        this.imei = imei;
        this.model = model;
        this.number = "";
    }

    public void registerNom(Network name) {
        this.number = name.getFreeNumber(this);
        if (this.number.equals("")) {
            System.out.println(this.model + ", IMEI " + this.imei +
                    " can not be registered: no more free numbers");
        }
        else {
            System.out.println(this.model + ", IMEI " + this.imei +
                    " was registered: new number - " + this.number);
        }
    }

    public void outgoingDial(String nom) {
        System.out.println(this.model + ": Dialing " + nom + "...");
        if (this.number.equals("")) {
            System.out.println(this.model + ", IMEI " + this.imei +
                    " has not registered");
        }
        else {
            System.out.println(Network.call(this.number, nom));
        }
    }

    public String incomingDial(String nom) {
        return  (this.model + ": Incoming dial from " + nom);
    }
}
