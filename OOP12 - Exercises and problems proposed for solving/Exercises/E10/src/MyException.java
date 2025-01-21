public class MyException extends RuntimeException {
  private static int counter;

    public void metodaMea(){
      counter++;
    }

    public void showCounter(){
      System.out.println(counter);
    }

}
