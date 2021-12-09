final class Stack {

  /**
  * Prevent instantiation
  * Throw an exception IllegalStateException.
  * if this ever is called
  *
  * @throws IllegalStateException
  *
  */
  private Stack() {
    throw new IllegalStateException("Cannot be initated.");
  }

    /**
    * The starting main() function.
    *
    * @param args Name of file containing a string of numbers
    */
  public static void main(final String[] args) {
    final int min = 1;
    final int max = 10;
    final int multi = 4;
    int times = multi;
    // use MrCoxallStack class
    MrCoxallStack newStack = new MrCoxallStack();
    while (times >= 0) {
      final int randomizer = (int) Math.floor(Math.random() * (max - min + 1)
      + min);
      newStack.push(randomizer);
      times -= 1;
    }
    newStack.showStack();
    newStack.pop();
    newStack.showStack();
  }
}
