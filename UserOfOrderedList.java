// does not have add(), remove() or set()

public class UserOfOrderedList {
    public static void main(String[] args) {

        // use a constructor to initialize an empty OrderedList_inArraySlots
        OrderedList_inArraySlots list = new OrderedList_inArraySlots();

        // print out an empty ordered list:
        System.out.println("empty list: " + list);

        list.add(5);
        list.add(3);
        list.add(8);
        list.add(7);
        System.out.println("expecting [3, 5, 7, 8,] received: " + list);
        // get an element at a desired index:
        System.out.println("expecting 7, received: " + list.get(2));
        System.out.println("expecting 0, received: " + list.get(5));
        System.out.println("expecting 3, received: " + list.get(0));

        // return the size of the list:
        System.out.println("size of list: " + list.size());

        // remove an element:
        list.remove(2);
        System.out.println("expecting [3,5,8,] received: " + list);

    }
}
