public class SecurePin{
  int finalPin(String userPin){
    int count  = 0;
    if(userPin.length() < 6){
        count++;
      }
    if(userPin.length() < 20){
      count ++;
    }
    for(int i = 0 ;i<20;i++){
      userPin += userPin.charAt(i);
    }
    
    for(int i= 0 ; i <userPin.length();i++){
      if(!(Character.isLowerCase(userPin.charAt(i)))){
        count++;
      }else if(!(Character.isUpperCase(userPin.charAt(i)))){
        count++;
      }else if(!(Character.isUpperCase(userPin.charAt(i)))){
        count++;
      }
    }

    char first = userPin.charAt(0);
    int test = 0;
    for (int i = 0; i < userPin.length(); i++) {
      if (userPin.charAt(i) == first) {
        test++;
      }
      else{
        first = userPin.charAt(i);
      }
    }
    if(test == 3){
      count ++;
    }

    return count;
  }
  public static void main(String[] args) {
    SecurePin s1 = new SecurePin();
    int result =s1.finalPin("X1!");
    System.out.println(result);
    
  }
}
