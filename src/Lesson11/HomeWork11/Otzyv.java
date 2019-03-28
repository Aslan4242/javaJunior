package Lesson11.HomeWork11;

public class Otzyv {
    private String textPlus;
    private String textMinus;
    private int like;
    private int dislike;

    public Otzyv() {
    }

    public Otzyv(String textPlus, String textMinus, String review, int like, int dislike) {
        this.textPlus = textPlus;
        this.textMinus = textMinus;
        this.like = like;
        this.dislike = dislike;
    }

    public String getTextPlus() {
        return textPlus;
    }

    public void setTextPlus(String textPlus) {
        this.textPlus = textPlus;
    }

    public String getTextMinus() {
        return textMinus;
    }

    public void setTextMinus(String textMinus) {
        this.textMinus = textMinus;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }
}

