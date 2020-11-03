public class Helpers {
  public static String formatArrayString(String[] arr) {
    String s = "";
    for (String i : arr) {
      s += i.toString() + " ";
    }
    return s;
  }
}
