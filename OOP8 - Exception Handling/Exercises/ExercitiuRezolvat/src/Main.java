//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyException e;

        e = new MyException("primul caz");
        System.out.println(e.getMessage());
        System.out.println(e.getInstanceNo());

        e = new MyException("al doilea caz");
        System.out.println(e.getMessage());
        System.out.println(e.toString());

        e = new MyException("al treilea caz");
        //e.printStackTrace();
        System.out.println(e.toString());

        System.out.println(MyException.getInstanceNo());

    }
}