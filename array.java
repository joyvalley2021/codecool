public class array {
  static String[] x = new String[10];
  public static void main(String[] args) {
    System.out.println("Hello world helen!");
    int[] a = {1, 2, 3, 4, 5};
    String[] months = {"Jan", "Feb", "Mar"};

    x[9] = "ST";
    for (int i = 0; i < x.length; i++) {
      System.out.println(" i = " + i + " value = " + x[i]);
    }

    int[][] m = {{1, 2, 3}, 
                 {4, 5, 6}, 
                 {7, 8, 9}};
    System.out.println(" m[1][2] = " + m[1][2]);
    System.out.println(" m row size = " + m.length); 
    System.out.println(" m col size = " + m[0].length);
  }
}
