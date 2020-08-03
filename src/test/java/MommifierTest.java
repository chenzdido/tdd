import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_insert_mommy_when_convert_given_string_is_aaple(){
        Mommifier mommifier=new Mommifier();
        String result=mommifier.convert("aaple");
        assertEquals("amommyaple",result);
    }

    @Test
    void should_return_original_string_when_convert_given_string_vowel_length_less_30(){
        Mommifier mommifier=new Mommifier();
        String result=mommifier.convert("dog");
        assertEquals("dog",result);
    }

    @Test
    void should_return_original_string_when_convert_given_string_without_continuous_of_vowel(){
        Mommifier mommifier=new Mommifier();
        String result=mommifier.convert("opela");
        assertEquals("opela",result);
    }

}
