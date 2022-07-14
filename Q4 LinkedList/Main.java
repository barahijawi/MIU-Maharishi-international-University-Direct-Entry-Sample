public class Main {
    public static void main(String[] args) {
        MyLinkedList bara = new MyLinkedList();

        bara.add("Straight");
        bara.add("Bent");
        bara.add("Equals");
        bara.add("Well");
        bara.add("Storm");

        System.out.println("find('Well')"+bara.find("Well"));
        System.out.println("find('Storm')" + bara.find("Storm"));
        System.out.println("find('anything')" + bara.find("anything"));

        System.out.println(bara.toString());


    }
}