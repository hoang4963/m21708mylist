public class TestMyClass {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(0,1);
        integerMyList.add(1,2);
        integerMyList.add(2,3);
        integerMyList.add(3,4);
        integerMyList.add(4,5);
        integerMyList.add(5,6);
        integerMyList.add(6,7);
        integerMyList.add(7,8);
        integerMyList.add(8,9);
        integerMyList.add(9,10);
        System.out.println(integerMyList.contains(5));
        System.out.println(integerMyList.size());
        System.out.println(integerMyList.indexOf(5));
        System.out.println(integerMyList.remove(5));
        System.out.println(integerMyList.contains(5));
        System.out.println(integerMyList.size());
        System.out.println(integerMyList.indexOf(5));
    }
}
