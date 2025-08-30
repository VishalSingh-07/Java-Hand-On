package Question2;

import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Laptop[] laptops = new Laptop[4];
        for(int i=0;i<4;i++){
            int laptopId=scan.nextInt();
            scan.nextLine();
            String brand=scan.nextLine();
            String osType=scan.nextLine();
            double price=scan.nextDouble();
            int rating=scan.nextInt();
            laptops[i]=new Laptop(laptopId,brand,osType,price,rating);
        }
        scan.nextLine();
        String givenBrand=scan.nextLine();
        String givenOsType=scan.nextLine();

        int countLaptop=countOfLaptopsByBrand(laptops,givenBrand);
        if(countLaptop!=0){
            System.out.println(countLaptop);
        }
        else{
            System.out.println("The given brand is not available");
        }
        Laptop[] searchedLaptops=searchLaptopByOsType(laptops,givenOsType);
        if(searchedLaptops!=null){
            for(int i=0;i<searchedLaptops.length;i++){
                System.out.println(searchedLaptops[i].getLaptopId());
                System.out.println(searchedLaptops[i].getRating());
            }
        }
        else{
            System.out.println("The given os is not available");
        }
    }
    public static int countOfLaptopsByBrand(Laptop[] laptops, String givenBrand){
        int countLaptop=0;
        for(Laptop ls: laptops){
            if(ls.getBrand().equalsIgnoreCase(givenBrand) && ls.getRating()>3){
                countLaptop++;
            }
        }
        return countLaptop;
    }
    public static Laptop[] searchLaptopByOsType(Laptop[] laptops, String givenOsType) {
        ArrayList<Laptop> searchedLaptop = new ArrayList<>();
        for (Laptop ls: laptops) {
            if (ls.getOsType().equalsIgnoreCase(givenOsType)) {
                searchedLaptop.add(ls);
            }
        }
        if (searchedLaptop.isEmpty()) {
            return null;
        }
        searchedLaptop.sort(Comparator.comparing(Laptop::getLaptopId).reversed());
        return searchedLaptop.toArray(new Laptop[0]);
    }
}
class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}