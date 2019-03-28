package Lesson11.HomeWork11;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.setMainTitle("Компактная мышь беспроводная Defender Laguna MS-245 зеленый");
        mouse.setPrice(399);
        mouse.setOtsenka(4.8);
        mouse.setGarantia(6);
        mouse.setCountry("Китай");

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

        mouse.setPhotos(photos);

        Video video1 = new Video();
        video1.setPathToVideo("vvv");
        video1.setPathToPreview("bbb");

        mouse.setVideo(video1);

        Otzyv otzyv1 = new Otzyv();
        otzyv1.setLike(5);
        otzyv1.setDislike(3);
        otzyv1.setTextMinus("textMinus");
        otzyv1.setTextPlus("textPlus");

        Otzyv otzyv2 = new Otzyv();
        otzyv2.setLike(6);
        otzyv2.setDislike(2);
        otzyv2.setTextMinus("textMinus");
        otzyv2.setTextPlus("textPlus");

        Otzyv[] otzyvs = new Otzyv[2];
        otzyvs[0] = otzyv1;
        otzyvs[0] = otzyv2;

        mouse.setReview(otzyvs);

    }
}
