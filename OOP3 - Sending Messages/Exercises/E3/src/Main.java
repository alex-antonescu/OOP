//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //Un p˘atrat este caracterizat de latura sa. Scriet¸i o clas˘a Patrat ce are doi constructori,
        //un constructor f˘ar˘a nici un parametru care seteaz˘a latura p˘atratului ca fiind 10
        //iar altul care seteaz˘a latura cu o valoare egal˘a cu cea a unui parametru transmis
        //constructorului. Ata¸sat¸i clasei o metod˘a potrivit˘a pentru tip˘arirea unui p˘atrat sub
        //forma ”Patrat” l ”Aria” a, unde l este valoarea laturii iar a este valoarea ariei
        //p˘atratului. Creat¸i ˆıntr-o metod˘a main diferite obiecte de tip Patrat ¸si tip˘arit¸i-le

        Patrat patrat1 = new Patrat();
        Patrat patrat2 = new Patrat(55);

        patrat1.datePatrat();
        patrat2.datePatrat();
        }
    }
