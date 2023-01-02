class Main {
  public static void main(String[] args) {
    Quadratic quad1 = new Quadratic();
    Quadratic quad2 = new Quadratic(1, -8, 15);
    Quadratic quad3 = new Quadratic(1, 0, 9);

    Quadratic[] quads = {quad1, quad2, quad3};
    for (Quadratic quad : quads) {
      try {
        System.out.println(quad + " has roots at " + quad.displayRealRoots());
      } catch (ArithmeticException e) {
        System.out.println(quad + ": " + e);
      }
    }
  }
}