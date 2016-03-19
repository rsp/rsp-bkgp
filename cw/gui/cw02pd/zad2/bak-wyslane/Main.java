/**
 *
 *  @author Pocztarski Rafał S13658
 *
 */

package Zad2;



import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    String fname = System.getProperty("user.home") + "/textforwords.txt";
    CountWords cw = new CountWords(fname);
    List<String> result = cw.getResult();
    for (String wordRes : result) {
      System.out.println(wordRes);
    }
  }
}
