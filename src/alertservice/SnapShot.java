package alertservice;

import java.util.ArrayList;

public class SnapShot {
    private ArrayList<Integer> data;

    public SnapShot(ArrayList<Integer> data) {
        this.data = data;
    }

    public ArrayList<Integer> restore() {
        return this.data;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        SnapShot snap = new SnapShot(list);
        list.set(0, 3);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
        list.add(4);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
    }
}