//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
        try {
            for(int i = 0; i < 4; i++){
                if(i==0) throw new L1();
                else throw new L2();
            }
        } catch(L1 e) {
            System.out.println(e);
        } catch (L2 e) {
            System.out.println(e);
        }

    }
}