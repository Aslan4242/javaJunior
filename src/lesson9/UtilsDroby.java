package lesson9;

public class UtilsDroby {
    public static int commonZnam(DrobnoeChislo drb1, DrobnoeChislo drb2){
        int common = 1;
        for (int i =1;i<drb1.getZnamenatel()*drb2.getZnamenatel();i++){
            if(i%drb1.getZnamenatel()==0 && i%drb2.getZnamenatel()==0){
                common = i;
                break;
            }
        }
        return common;
    }
}
