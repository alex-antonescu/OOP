//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creare ustensile
        Furculita f1 = new Furculita("f1");
        Furculita f2 = new Furculita("f2");
        Furculita f3 = new Furculita("f3");
        Furculita f4 = new Furculita("f4");
        Furculita f5 = new Furculita("f5");

        //Creare persoane
        Filosof F1 = new Filosof("1",f1,f2);
        Filosof F2 = new Filosof("2",f2,f3);
        Filosof F3 = new Filosof("3",f3,f4);
        Filosof F4 = new Filosof("4",f4,f5);
        Filosof F5 = new Filosof("5",f5,f1);

        F1.start();
        F2.start();
        F3.start();
        F4.start();
        F5.start();
    }
}