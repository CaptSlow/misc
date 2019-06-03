package com.danf.misc;

/**
 * A function which takes a non-negative integer (seconds) as input and
 * returns the time in a human-readable format (HH:MM:SS)
 *
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * The maximum time never exceeds 359999 (99:59:59)
 *
 * You can find some examples in the test fixtures.
 */
class HumanReadableTime {

  static String makeReadable(int seconds) {
    int hours = seconds/(60*60);
    int minutes = (seconds-(hours*60*60))/60;
    int secs = seconds - (minutes*60 + hours*60*60);
    return String.format("%02d:%02d:%02d",hours,minutes,secs);
  }

}
