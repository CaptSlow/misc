package com.danf.misc;

public class OrderStringsByNumber {

  String order(String words) {
    String[] wordArr = words.split(" ");
    String[] mywords = new String[wordArr.length];

    for (String word : wordArr) {
      mywords[this.findNumber(word) - 1] = word;
    }

    StringBuilder myword = new StringBuilder();
    for (String word : mywords) {
      myword.append(word);
      myword.append(" ");
    }
    myword.deleteCharAt(myword.toString().length() - 1);

    return myword.toString();
  }

  private int findNumber(String word) {
    char[] letters = word.toCharArray();
    for (char letter : letters) {
      if (Character.isDigit(letter)) {
        return Character.getNumericValue(letter);
      }
    }
    throw new RuntimeException("No number in string");
  }

}