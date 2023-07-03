package factoryDesignPractice;

abstract class Plan {
    protected  int rate;

    abstract void getRate();

    public float generateBill(int units){
        System.out.println(" the generated bill will be:"+ rate * units);
        return rate*units;
    }
}
