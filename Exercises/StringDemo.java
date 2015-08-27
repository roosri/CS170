/**
 * Demo code for String class
 * 
 * @author ktran426
 * 
 */
public class StringDemo {

  public static void demoString() {
    String str1 = "String is immutable!";
    String str2 = "String is immutable!";
    String str3 = new String("String is immutable!");
    String str4 = new String("String is immutable!");
    String str5 = "String is immutable!".toUpperCase();

    // Check if str1 and str2 references the same string
    System.out.println("str1 == str2 " + (str1 == str2));

    // Check if the content of str1 and str2 are the same
    System.out.println("str1.compareTo(str2) " + str1.compareTo(str2));

    // Check if str3 and str4 references the same string
    System.out.println("str3 == str4 " + (str3 == str4));

    // Check if the content of str3 and str4 are the same
    System.out.println("str3.compareTo(str4) " + str3.compareTo(str4));

    // Print out the content i str5
    System.out.println("str5 = " + str5);

    // Check if str1 and str5 referenced the same string
    System.out.println("str1 == str5 " + (str1 == str5));
  }

  public static void main(String[] args) {

    // demoString();
    // 012345678901234567
    String myStr = "Java Programming 1";
    String myStr2 = new String("at Orange Coast College.");
    String myStr3 = new String("Java Programming 1");

    // char charAt(int index) - Returns the character at the specified
    // index.
    int index = 10;
    char charVar = myStr.charAt(index);
    System.out.println("character at index " + index + " = " + charVar);

    // boolean equals (String anotherString) - Compares two strings returns
    // true if two
    // strings are equal; o/w false
    System.out.println("Compare myStr to myStr2: " + myStr.equals(myStr2));
    System.out.println("Compare myStr to myStr3: " + myStr.equals(myStr3));

    // String concat(String str) - Concatenates the specified string to the
    // end of this string.
    String tmpStr = myStr.concat(myStr2);
    System.out.println("Result of concatenation myStr and myStr2: "
        + tmpStr);
    System.out.println("Result of concatenation myStr3 and myStr2: "
        + myStr3.concat(myStr2));

    // boolean endsWith(String suffix) - Tests if this string ends with the
    // specified suffix.
    System.out.println(myStr.endsWith("OCC"));
    System.out.println(myStr.endsWith("ming 1"));

    // int indexOf(int ch) - Returns the index within this string of the
    // first occurrence
    // of the specified character.
    System.out.println(myStr.indexOf('P'));

    // int indexOf(int ch, int fromIndex) - Returns the index within this
    // string of the first occurrence of the specified character,
    // starting the search at the specified index.
    System.out.println(myStr.indexOf('P', 6));

    // int indexOf(String str) - Returns the index within this string of the
    // first occurrence of the specified substring
    System.out.println(myStr.indexOf("Pro"));

    // int indexOf(String str, int fromIndex) - Returns the index within
    // this string of the first occurrence of the specified substring,
    // starting at the specified index.
    System.out.println(myStr.indexOf("Pro", 6));

    System.out.println("myStr = \n" + myStr);
    
    // int lastIndexOf(int ch) - Returns the index within this string of the
    // last occurrence of the specified character.
    System.out.println("myStr.lastIndexOf('m'): " + myStr.lastIndexOf('m'));
    System.out.println("myStr.lastIndexOf('p'): " + myStr.lastIndexOf('p'));

    // int lastIndexOf(int ch, int fromIndex) - Returns the index within
    // this string of the last occurrence of the specified character,
    // searching backward starting at the specified index.
    System.out.println("myStr.lastIndexOf('J', 6): " + myStr.lastIndexOf('J', 6));
    System.out.println("myStr.lastIndexOf('P', 4): " + myStr.lastIndexOf('P', 4));
    System.out.println("myStr.lastIndexOf('P', 6): " + myStr.lastIndexOf('P', 6));

    // int lastIndexOf(String str) - Returns the index within this string of
    // the rightmost occurrence of the specified substring.
    System.out.println("myStr.lastIndexOf(\"Pro\"): " + myStr.lastIndexOf("Pro"));

    // int lastIndexOf(String str, int fromIndex) - Returns the index within
    // this string of the last occurrence of the specified substring,
    // searching backward starting at the specified index.
    System.out.println("myStr.lastIndexOf(\"Pro\", 6): " + myStr.lastIndexOf("Pro", 6));

    // int length() - Returns the length of this string.
    System.out.println("Length of myStr: " + myStr.length());

    // String substring(int beginIndex) - Returns a new string that is a
    // substring of this string starting at beginIndex to the end.
    System.out.println(myStr.substring(7));
    System.out.println(myStr.substring(5));

    // String substring(int beginIndex, int endIndex) - Returns a new string
    // that is a substring of this string from beginIndex to endIndex.
    System.out.println(myStr.substring(0, 5));
    System.out.println(myStr.substring(7, 9));

    // String toLowerCase() - Converts all of the characters in this String
    // to lower case using the rules of the default locale.
    System.out.println("myStr.toLowerCase(): " + myStr.toLowerCase());

    // String toUpperCase() - Converts all of the characters in this String
    // to upper case using the rules of the default locale.
    System.out.println("myStr.toUpperCase(): " + myStr.toUpperCase());

    // String trim() - Returns a copy of the string, with leading and
    // trailing whitespace omitted.
    String myStr4 = "    leading blanks  " + myStr2 + "  trailing  blanks    ";
    System.out.println("myStr4: " + myStr4 + " myStr4.length() = " + myStr4.length());
    myStr4 = myStr4.trim();
    System.out.println("myStr4: " + myStr4 + " myStr4.length() = " + myStr4.length());
  }

}
