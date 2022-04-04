package creational.factory;

class GetPlanFactory {
    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DP")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("CP")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("IP")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}//end of GetPlanFactory class.  