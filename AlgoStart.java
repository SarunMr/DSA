public class AlgoStart{
   int maxCaptital(int k,int c,int revenue[],int investment[]){
    for(int i = 0; i<k ; i++){
      if(c>= investment[i]){
        c+= revenue[i];
      }
    }
      return c;
  }
  public static void main(String[] args) {
    int[] revenue = {3, 6, 10};
    int[] investment = {1, 3, 5};
    int k = 3;
    int c = 1;
    AlgoStart m1 = new AlgoStart();
    int result = m1.maxCaptital(k,c,revenue,investment);
    System.out.println("Final Capital = " + result);
  }
}


//Pros
//Cons
//* Investment needs to be sorted
//* Investment needs to be sorted
