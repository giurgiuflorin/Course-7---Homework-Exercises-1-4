package exercise1;

public class Facebook implements Advertisement {

    private int priceOfAdvertisement = 0;
    private int daysOfAdvertisement;
    private int pricePerDay;
    private String advertisedProduct;

    @Override
    public double priceOfAdvertisement() {
        if (advertisedProduct == "Product") {
            pricePerDay = 50;
        } else if (advertisedProduct == "Service") {
            pricePerDay = 40;
        } else {
            System.out.println("Only two options: product and service!");
        }
        for (int i = 0; i <= daysOfAdvertisement; i++) {
            priceOfAdvertisement += pricePerDay;
        }
        System.out.println("Total price for advertisement is $" + priceOfAdvertisement);
        return priceOfAdvertisement;

    }

    @Override
    public String advertisedProduct() {

        return advertisedProduct;

    }
}
