import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(99));

        System.out.println(arrayList.size());

//        for (Integer integer : arrayList) {
//            System.out.print(integer + " ");
//        }

        arrayList.remove(5);
        System.out.println(arrayList);
    }
}
