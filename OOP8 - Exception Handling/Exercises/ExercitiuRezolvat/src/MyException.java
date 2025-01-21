public class MyException extends Exception{
    private static int instanceNo = 0;

    public MyException(String message){
        super(message);
        instanceNo++;
    }

    public static int getInstanceNo(){
        return instanceNo;
    }
}
