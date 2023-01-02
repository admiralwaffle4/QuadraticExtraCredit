public class Quadratic {
  int a, b, c;

  public Quadratic(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Quadratic() {
    this(1, 0, 0);
  }

  public String toString() {
    return String.format("%dx² + %dx + %d", a, b, c);
  }

  public int discriminant() {
    int disc = (int)Math.pow(b, 2) - (4 * a * c);
    System.out.println(disc);
    return disc;
  }

  public double[] findRealRoots() throws ArithmeticException {
    double[] roots = new double[2];
    int disc = discriminant();
    if (disc < 0) {
      throw new ArithmeticException("No real roots");
    }

    roots[0] = ((b * -1) + Math.sqrt(disc)) / (2 * a);
    roots[1] = ((b * -1) - Math.sqrt(disc)) / (2 * a);

    return roots;
  }

  public String displayRealRoots() {
    try {
      double[] roots = findRealRoots();
      return String.format("{%.2f, %.2f}", roots[0], roots[1]);
    } catch (Exception e) {
      throw e;
    }
  }
}