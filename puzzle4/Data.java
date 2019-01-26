class Data{
  private int[] data;
  private int[] correctedData;

  public Data(int[] data){
    this.data = data;
    correctedData = new int[4];
  }

  void correctErrors(){
    int a = (data[0] + data[1
  }

  int p(int i){
    switch(i){
      case 1:
        return data[0];
      case 2:
        return data[1];
      case 3:
        return data[3];
      default:
        throw new RuntimeException("out of bounds");
    }
  }

  int d(int i){
    switch(i){
      case 1:
        return data[2];
      case 2:
        return data[4];
      case 3:
        return data[5];
      case 4:
        return data[6];
      default:
        throw new RuntimeException("out of bounds");
    }
  }

  int get(int i){
    return correctedData[i];
  }
}
