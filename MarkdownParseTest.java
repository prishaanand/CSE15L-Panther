import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile2() throws IOException{
        Path fileName = Path.of("./test-file2.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile3() throws IOException{
        Path fileName = Path.of("./test-file3.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile() throws IOException{
        Path fileName = Path.of("./test-file.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of("https://something.com", "some-page.html");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile4() throws IOException{
        Path fileName = Path.of("./test-file4.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile5() throws IOException{
        Path fileName = Path.of("./test-file5.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    //image ref not url
    @Test
    public void testFile6() throws IOException{
        Path fileName = Path.of("./test-file6.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile7() throws IOException{
        Path fileName = Path.of("./test-file7.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testFile8() throws IOException{
        Path fileName = Path.of("./test-file8.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of();
        //not correct since its not a link, just text
        //having spaces causes it to not be a link
        //account for this in the code
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

   // @Test
   // public void additionFail() {
    //    assertEquals(13, 1 + 12);
   // }

    @Test
    public void secondFail(){
        assertTrue(true);
    }


}