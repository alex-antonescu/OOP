public class Main {
    public static void main(String[] args) {

        Amenda a1 = new AmendaParcare("1031274456709");
        Amenda a2 = new AmendaPoluareSpatiuPublic("1031274456709",2);
        Amenda a3 = new AmendaDistrugereSpatiuPublic("1031274456709",2000);

        POLITIA manaLegiuitoare = new POLITIA();
        manaLegiuitoare.addAmenda(a1);
        manaLegiuitoare.addAmenda(a2);
        manaLegiuitoare.addAmenda(a3);

        Strategie s1 = new StrategieParcareInterzisa();
        Strategie s2 = new StrategieCNP("1031274456709");

        System.out.println(manaLegiuitoare.valoare(s1));
        System.out.println(manaLegiuitoare.valoare(s2));

    }
}
