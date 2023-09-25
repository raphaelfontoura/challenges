package SqueakyClean;

class SqueakyClean {
  static String clean(String identifier) {
      var cleanedString = new StringBuilder();
      var nextToUpper = false;

      for (char c: identifier.toCharArray()) {
        if (Character.isISOControl(c)) {
          cleanedString.append("CTRL");
        }
        else if (Character.isWhitespace(c)) {
          cleanedString.append('_');
        }  
        else if (c == '-') {
          nextToUpper = true;
        } 
        else if (Character.isLetter(c) && !isGreekLetter(c)) {
          if (nextToUpper) { 
            cleanedString.append(Character.toUpperCase(c));
            nextToUpper = false;
            continue;
          }
          cleanedString.append(c);
        }
      }
      return cleanedString.toString();
  }

  private static boolean isGreekLetter(char c) {
    return (c >= 'α' && c <= 'ω');
  }

  public static void main(String[] args) {
    System.out.println(clean("my    Id"));
    System.out.println(clean("my\0Id"));
    System.out.println(clean("à-ḃç"));
    System.out.println(clean("a1😀2😀3😀b"));
    System.out.println(clean("MyΟβιεγτFinder"));
    System.out.println(clean("my\0\r\u007FId"));
  }
}
