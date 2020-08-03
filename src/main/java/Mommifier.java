public class Mommifier {


    public String convert(String str) {
        StringBuilder s=new StringBuilder(str);
        int length=s.length();
        int vowel_numbers=0;
        int[] n=new int[length];
        int j=0;
        for(int i=0 ; i<length ; i++){
            char ch = s.charAt(i);
            if( ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel_numbers ++;
                if((i<length-1)&&(s.charAt(i+1) == 'a'|| s.charAt(i+1) == 'e' || s.charAt(i+1) == 'i' || s.charAt(i+1) == 'o' || s.charAt(i+1) == 'u')){
                    n[j]=i+1;
                    j++;
                }
            }
        }
        double percent=(double)vowel_numbers/(double)length;
        if (percent< 0.3||j==0) {
            return s.toString();
        }else{
            for(int k=0 ;k<j;k++){
                s.insert(n[k]+k*5,"mommy");
                }
            return s.toString();
            }

    }

}

