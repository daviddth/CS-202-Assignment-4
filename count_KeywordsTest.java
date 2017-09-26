import org.junit.Test;

import static org.junit.Assert.*;

public class count_KeywordsTest {
    @Test
    public void main() throws Exception {
        count_Keywords tester = new count_Keywords();
        String userinput1 = "C:\\Users\\David\\IdeaProjects\\assignment_01\\src\\upperCaseArray.java";
        assertEquals("UserInput for specific Java file must return 18", 18, tester.main(userinput1));
    }

}