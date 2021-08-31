package LinearSearch;


import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name= "Mohammad";
        char target = 'a';
        System.out.println(Search(name, target));
        System.out.println(Search2(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));//this function will char into string array

    }
    static boolean Search2(String str, char target){

        if (str.length() == 0){
            return false;
        }

      for(char ch: str.toCharArray()){
          if (ch == target){
              return true;
          }
      }
      return false;
    }



    static boolean Search(String str, char target){
        if (str.length()==0){
            return false;
      }
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
