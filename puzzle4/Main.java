import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
    Main m = new Main();
    m.solve();
  }

  static final String Filename = "input.txt";
  static final String Filename2 = "chars.txt";

  Vector<Character> symbols;
  Vector<Integer> numbers;

  void solve(){
    StringBuilder s = new StringBuilder();
    for(int i = 0; i < numbers.size(); i++){
      char c = (char)(numbers.get(i).intValue());
      if(symbols.get(i) != '.' && symbols.get(i) != c) throw new RuntimeException("mismatch, wrong algorithm");
      s.append(c);
      System.out.println(c);
    }
    System.out.println(s);
  }

  void printKnown(){
    for(int i = 0; i < symbols.size(); i++){
      if(symbols.get(i) != '.'){
        System.out.printf("\n%5d%5c",numbers.get(i), symbols.get(i));
      }
    }
    System.out.println("\n"+(int)'a');
  }

  public Main(){
    symbols = new Vector<Character>();
    numbers = new Vector<Integer>();

    try{
      Scanner in = new Scanner(new File(Filename));

      while(in.hasNext()){
        numbers.add(Integer.parseInt(in.next(), 16));
      }

      in.close();
      in = new Scanner(new File(Filename2));

      while(in.hasNextLine()){
        String s = in.nextLine();
        for(int i = 0; i < s.length(); i++){
          symbols.add(s.charAt(i));
        }
      }
      in.close();
    }
    catch(Exception e) {e.printStackTrace();}

    if (symbols.size() != numbers.size()) throw new RuntimeException();
  }
}
