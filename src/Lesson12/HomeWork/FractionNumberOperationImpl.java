package Lesson12.HomeWork;

public class FractionNumberOperationImpl implements FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonZnam = 0;
        for (int i = 1; i >=1; i++) {
            if (i%a.getDivisor()==0 && i%b.getDivisor()==0){
                commonZnam = i;
                break;
            }
        }
        FractionNumber result = new FractionNumberImpl();
        result.setDivisor(commonZnam);
        result.setDividend(a.getDividend()*(commonZnam/a.getDivisor())+b.getDividend()*(commonZnam/b.getDivisor()));

        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonZnam = 0;
        for (int i = 1; i >=1; i++) {
            if (i%a.getDivisor()==0 && i%b.getDivisor()==0){
                commonZnam = i;
                break;
            }
        }
        FractionNumber result = new FractionNumberImpl();
        result.setDivisor(commonZnam);
        result.setDividend(a.getDividend()*(commonZnam/a.getDivisor())-b.getDividend()*(commonZnam/b.getDivisor()));

        return result;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {

        FractionNumber result = new FractionNumberImpl();
        result.setDivisor(a.getDivisor()*b.getDivisor());
        result.setDividend(a.getDividend()*b.getDividend());

        return result;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        FractionNumber result = new FractionNumberImpl();
        result.setDivisor(a.getDivisor()*b.getDividend());
        result.setDividend(a.getDividend()*b.getDivisor());

        return result;
    }
}
