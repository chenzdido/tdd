public class Mommifier {


    public String convert(String str) {
        StringBuilder s=new StringBuilder(str);
        int length=s.length();
        int vowel_numbers=0;
        int[] continuous=new int[length];
        int continuous_num=0;
        for(int i=0 ; i<length ; i++){
            if(isvowels(s.charAt(i))){
                vowel_numbers ++;
                if((i<length-1)&&(isvowels(s.charAt(i+1)))){
                    continuous[continuous_num]=i+1;
                    continuous_num++;
                }
            }
        }
        double vowel_percent=(double)vowel_numbers/(double)length;
        if (!(vowel_percent < 0.3) && continuous_num != 0) {
            for (int k = 0; k < continuous_num; k++) {
                s.insert(continuous[k] + k * 5, "mommy");
            }
        }
        return s.toString();

    }

    private boolean isvowels(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}

