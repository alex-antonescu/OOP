//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var selectareFisiere = new CitireFisier();
        selectareFisiere.start();
        var numereDeComparat = new NumereDeComparat(selectareFisiere);
        numereDeComparat.extractNumbersFromFile();
    }
}