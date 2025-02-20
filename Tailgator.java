public class Tailgator {
    private static int drinksInCooler;
    private static int numberOfTailgaters;

    public static int getNumberOfTailgaters() {
        return numberOfTailgaters;
    }

    public String name;
    public Boolean isBingFan;
    public int drinks;

    public Tailgator(String name, Boolean isBingFan){
        this.name = name;
        this.isBingFan = isBingFan;
        
        if(isBingFan == false){
            for (int i = 0; i < 20; i++) {
                System.out.println("Go Binghamton!!!!!");
            }
        }
        numberOfTailgaters =+ 1;
    } 
    
    public String getName(){
        return name;
    }

    public Boolean isBingFan(){
        return isBingFan;
    }

    public void getDrinkFromCooler(){
        if(drinksInCooler > 0){
            drinksInCooler--;
            drinks++;
        }
    }

    public Boolean isCoolerEmpty(){
        return drinksInCooler == 0;     
    }

    public void addDrinkstoCooler(int drinks){
        drinksInCooler =+ drinks;
        System.out.println(drinksInCooler);
    }

}
