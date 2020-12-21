public static void main(String[] args) {
    System.out.println("Hello world helen!");
    int[] a = {1, 2, 3, 4, 5};
    double[] d = {1.1, 3.4, 7.7};
    func f = new func();
    int val = f.sum(a);
    System.out.println("val = " + val);

    double v2 = f.sum(d);
    System.out.println("v2 = " + v2);

    int v3 = f.sum(a[0], a[2], a[3]);
    System.out.println("v3 = " + v3);
  }
  
  public int sum(int a, int b, int c) {
     return a + b + c;
  }
  public int sum(int[] b) {
    int all = 0;
    for (int i = 0; i < b.length; i++) {
      all += b[i];
    }
    return all;
  }

  public double sum(double[] b) {
    double all = 0;
    for (double d : b) {
      all += d;
    }
    return all;
  }
}
