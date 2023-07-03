package factoryDesignPractice;

public class PlanFactory {
    public Plan getPlanObject(String planType){
        if(planType.equalsIgnoreCase("DomesticPlan")){
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("InstitutionalPlan")) {
            return new InstitutionalPlan();
        }else if (planType.equalsIgnoreCase("CommercialPlan")){
            return new CommercialPlan();
        }
        return null;
    }

}
