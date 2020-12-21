public class TestVar {
  public static void main(String[] args) {
    System.out.println("Hello world helen!");
    int[] a = {1, 2, 3, 4, 5};
    Main m = new Main();
    
    boolean isDec = true;
    int x = 12;
    long y = 20;
    boolean isTrue = false;
    char c1 = 'A';
    char c2 = 'a';
    
    String bb = Integer.toString(x, 2);
    String hh = Integer.toString(x, 16);
    System.out.println(" x (10) = " + x);
    System.out.println(" x (2) = " + bb);
    System.out.println(" x (16) = " + hh);

    System.out.println("isDec = " + isDec);
    System.out.println("isTrue = " + isTrue);
    System.out.println("c1 = " + (int)c1 + "  c2 = " 
        + (int)c2);

    System.out.println(" c2 - c1 = " + (c2 - c1));

    if (x >= y && c1 == c2) {
      System.out.println("x is smaller");
    } else {
      System.out.println("y is smaller");
    }
  }
}
