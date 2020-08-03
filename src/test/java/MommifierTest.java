import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void shoule_return_mommy_when_convert__given_string_is_aaple(){
        Mommifier mommifier=new Mommifier();
        String result=mommifier.convert();
        assertEquals("amommyaple",result);
    }
}
