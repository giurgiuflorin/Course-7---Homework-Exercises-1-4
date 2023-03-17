package exercise1;

public class Email implements Advertisement {

    private int priceOfAdvertisement = 0;
    private int daysOfAdvertisement;
    private int pricePerDay;
    private String advertisedProduct;

    @Override
    public double priceOfAdvertisement() {
        if (advertisedProduct == "Product") {
            pricePerDay = 30;
        } else if (advertisedProduct == "Service") {
            pricePerDay = 20;
        } else {
            System.out.println("Only two options: product and service!");
        }
        for (int i = 0; i <= daysOfAdvertisement; i++) {
            priceOfAdvertisement += pricePerDay;
        }
        return priceOfAdvertisement;
    }

    @Override
    public String advertisedProduct() {

        return advertisedProduct;

    }
}
