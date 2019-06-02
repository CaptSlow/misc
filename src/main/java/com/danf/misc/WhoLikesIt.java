package com.danf.misc;

/**
 * Class to take list of names and display facebook-esque like statement, e.g.
 * {"Bob","Tom","Louise","Emily"} returns
 * Bob, Tom and 2 two others like this
 * todo create test class
 */
class WhoLikesIt {


  public static String whoLikesIt(String... names) {
    int numVars = names.length;

    switch (numVars) {
      case 0:
        return "no one likes this";
      case 1:
        return names[0] + " likes this";
      case 2:
        return names[0] + " and " + names[1] + " like this";
      case 3:
        return names[0] + ", " + names[1] + " and " + names[2] + " like this";
      default:
        return names[0] + ", " + names[1] + " and " + (numVars - 2) + " others like this";
    }
  }
}
