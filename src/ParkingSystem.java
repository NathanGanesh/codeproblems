import java.util.ArrayList;
import java.util.HashMap;

public class ParkingSystem {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
        parkingSystem.addCar(1);
        parkingSystem.addCar(2);
        parkingSystem.addCar(3);
        parkingSystem.addCar(1);
        System.out.println(parkingSystem.booleanArrayList);
    }

    private int bigCounter = 0, mediumCounter = 0, smallCounter = 0;
    private int big, medium, small;
    private ArrayList<Boolean> booleanArrayList;

    //1 big
    //2 medium
    //3 small
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
        booleanArrayList = new ArrayList<>();
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (bigCounter == getBig()) {
                    booleanArrayList.add(false);
                    return false;
                } else {
                    bigCounter++;
                    booleanArrayList.add(true);
                    return true;
                }
            case 2:
                if (mediumCounter == getMedium()) {
                    booleanArrayList.add(false);
                    return false;
                }else{
                    booleanArrayList.add(true);
                    mediumCounter++;
                    return true;
                }
            case 3:
                if (getSmall() == smallCounter){
                    booleanArrayList.add(false);
                    return false;
                }else{
                    booleanArrayList.add(true);
                    smallCounter++;
                    return true;
                }
        }
        return false;
    }

    public int getBig() {
        return big;
    }

    public int getMedium() {
        return medium;
    }

    public int getSmall() {
        return small;
    }
}
