public class HouseTester {

    public static void main(String[] args) {
        HouseTester houseTester = new HouseTester();
        houseTester.testNamoKaina();
    }

    public void testNamoKaina() {
        House house = new House();
        if(house.kaina > 4000){
            System.out.println("Namas brangus");
        } else {
            System.out.println("Namas pigus");
        }
    }
}
