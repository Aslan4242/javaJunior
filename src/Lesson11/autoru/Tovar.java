package Lesson11.autoru;

public class Tovar {
    private String mainTitale;
    private String datePublic;
    private int countView;
    private int countViewToday;
    private int price;
    private Photo[] photos = new Photo[10];
    private String mainText;
    private Otzyv[] review = new Otzyv[100];


    public String getMainTitale() {
        return mainTitale;
    }

    public void setMainTitale(String mainTitale) {
        this.mainTitale = mainTitale;
    }

    public String getDatePublic() {
        return datePublic;
    }

    public void setDatePublic(String datePublic) {
        this.datePublic = datePublic;
    }

    public int getCountView() {
        return countView;
    }

    public void setCountView(int countView) {
        this.countView = countView;
    }

    public int getCountViewToday() {
        return countViewToday;
    }

    public void setCountViewToday(int countViewToday) {
        this.countViewToday = countViewToday;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public void setPhotos(Photo[] photos) {
        this.photos = photos;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public Otzyv[] getReview() {
        return review;
    }

    public void setReview(Otzyv[] review) {
        this.review = review;
    }
}


