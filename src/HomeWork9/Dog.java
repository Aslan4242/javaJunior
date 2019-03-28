package HomeWork9;

public class Dog {
    private String name;
    private String poroda;

    public void setName(String nm) {
        name = nm;
    }

    public void setPoroda(String prd) {
        poroda = prd;
    }

    public String getName() {
        return name;
    }

    public String getPoroda() {
        return poroda;
    }

    public Dog() {

    }

    public Dog(String nm) {
        name = nm;
    }

    public Dog(String nm, String prd) {
        name = nm;
        poroda = prd;
    }

    public void print() {
        System.out.printf("Порода собаки %s", poroda);
    }

}
