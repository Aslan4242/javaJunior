package Lesson11.autoru;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMainTitale("Hyundai");
        car.setDatePublic("7 февраля");
        car.setCountView(733);
        car.setCountViewToday(27);
        car.setPrice(715000);

        Photo photo1 = new Photo();
        photo1.setPathToBigPhoto("fff");
        photo1.setPathToSmallPhoto("ggg");

        Photo photo2 = new Photo();
        photo1.setPathToBigPhoto("qqq");
        photo1.setPathToSmallPhoto("yyy");

        Photo photo3 = new Photo();
        photo1.setPathToBigPhoto("xxx");
        photo1.setPathToSmallPhoto("zzz");

        Photo [] photos = new Photo[3];
        photos[0] = photo1;
        photos[1] = photo2;
        photos[2] = photo3;

        car.setPhotos(photos);

        Otzyv otzyv1 = new Otzyv();
        otzyv1.setLike(5);
        otzyv1.setDislike(3);
        otzyv1.setReview("Text");
        otzyv1.setTextMinus("textMinus");
        otzyv1.setTextPlus("textPlus");

        Otzyv otzyv2 = new Otzyv();
        otzyv2.setLike(6);
        otzyv2.setDislike(2);
        otzyv2.setReview("Text2");
        otzyv2.setTextMinus("textMinus");
        otzyv2.setTextPlus("textPlus");

        Otzyv[] otzyvs = new Otzyv[2];
        otzyvs[0] = otzyv1;
        otzyvs[0] = otzyv2;

        car.setReview(otzyvs);




    }
}
