public class OrderedList_inArraySlots {
    private List_inArraySlots list;

    public OrderedList_inArraySlots() {
        list = new List_inArraySlots();
    }

    public int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

    public int get(int index) {
        return list.get(index);
    }

    // public int set() {}

    public boolean add(int value) {
        int index = 0;
        for (; index < list.size() && list.get(index) < value; index++) {}
        return list.add(index, value);
    }

    public int remove(int index) {
        return list.remove(index);
    }

}
