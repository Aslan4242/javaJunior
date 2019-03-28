package Lesson11.HomeWork11;

public class Tovar {
    private String MainTitle;
    private int price;
    private double otsenka;
    private Photo[] photos = new Photo[10];
    private Video video = new Video();
    private int garantia;
    private String country;
    private Otzyv[] review = new Otzyv[100];
    private Haraktesitiki h1 = new Haraktesitiki();
    private Opisanie opisanie = new Opisanie();

    public String getMainTitle() {
        return MainTitle;
    }

    public void setMainTitle(String mainTitle) {
        MainTitle = mainTitle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getOtsenka() {
        return otsenka;
    }

    public void setOtsenka(double otsenka) {
        this.otsenka = otsenka;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }
    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Otzyv[] getReview() {
        return review;
    }

    public void setReview(Otzyv[] review) {
        this.review = review;
    }

    public Haraktesitiki getH1() {
        return h1;
    }

    public void setH1(Haraktesitiki h1) {
        this.h1 = h1;
    }

    public Opisanie getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(Opisanie opisanie) {
        this.opisanie = opisanie;
    }
}
