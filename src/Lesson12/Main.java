package Lesson12;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver(23, "Igor");
        Driver driver2 = new Driver(26,"Sam");

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Rabotnik [] emp = new Rabotnik[4];
        emp[0]=driver1;
        emp[1]=driver2;
        emp[2]=teacher1;
        emp[3]=teacher2;
        for (int i = 0; i <emp.length ; i++) {
            emp[i].doWork();
        }



    }


}
