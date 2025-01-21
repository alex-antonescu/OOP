public class Main {
    public static void main(String[] args) throws CustomVerifiedException {
        verifyWorkflow(2, 5);
        verifyWorkflow(5, 2);


    }

    public static void verifyWorkflow(int a, int b) throws CustomVerifiedException {
        if (a < b) {
            try {
                throw new CustomUnverifiedException();

            } catch (CustomUnverifiedException e) {
                e.getCustomMessage();
            }
        } else {
            try {
                throw new CustomVerifiedException();

            } catch (CustomVerifiedException e) {
                e.getCustomMessage();
            }
        }
    }
}
