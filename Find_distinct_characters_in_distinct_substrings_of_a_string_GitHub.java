
// String = "ABCA"
// count of distinct characters : 18

// String = "AAAB"
// count of distinct characters : 10



import java.util.HashSet;


public class Find_distinct_characters_in_distinct_substrings_of_a_string_GitHub{

    static int countTotalDistinct(String str, int n) {


        int count = 0;
        HashSet<String>  items = new HashSet<>();
        for(int i=0; i<n; i++){

            String temp = "";

            HashSet<Character> ans = new HashSet<>();
            for (int j = i; j < n; j++){

                temp = temp + str.charAt(j);
                ans.add(str.charAt(j));

                if(!items.contains(temp)){

                    items.add(temp);

                    count = count + ans.size();
                }
            }
        }

    return count;
    }


    public static void main(String[] args){
        String str = "AAAB";
        int n = str.length();

//                countTotalDistinct(str, n);



        System.out.println(" count of distinct characters : " + countTotalDistinct(str, n));
    }
}