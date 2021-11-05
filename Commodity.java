package task1;

public class Commodity {
    private String vendorCode;
    private String measure;
    private double price;
    private String desc;

    public Commodity(String vendorCode, String measure, double price, String desc) {
        this.vendorCode = vendorCode;
        this.measure = measure;
        this.price = price;
        this.desc = desc;
    }

    public Commodity() {
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public String getMeasure() {
        return measure;
    }

    public double getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "vendor_code='" + vendorCode + '\'' +
                ", mesure='" + measure + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }

    public void about () {
        System.out.println(this.toString());
    }
}
