class Main{
  public static void main(String[] args){
    Main m = new Main();
    m.solve();
  }

  static final int Shift = 7;
  char[] code1 = new char[26];
  char[] code2 = new char[26];
  char[] message1 = "jhbmj aqkwes yvx".toCharArray();
  char[] message2 = "jajua vjqpal uoo".toCharArray();

  void solve(){
    char[] message = new char[message1.length];
    for(int i = 0; i < message1.length; i++){
      if(message1[i] == ' ') message[i] = ' ';
      else{
        int result = (message2[i] - message1[i]);
        if (result < 0) result += 26;
        if (result > 25) result -= 26;
      
        message[i] = code2[result];
      }
    }
    System.out.println(message);
  }

  public Main(){
    for(int i = 0; i < 26; i++){
      code1[i] = (char)('a' + i);
      int y = i + Shift;
      if(y > 25) y -= 26;
      code2[i] = (char)('a' + y);
    }
  }

  static void printArr(char[] arr){
    StringBuilder s = new StringBuilder();

    for(int i = 0; i < arr.length - 1; i++){
      s.append(arr[i]);
      s.append(' ');
    }
    s.append(arr[arr.length - 1]);

    System.out.println(s);
  }
}
