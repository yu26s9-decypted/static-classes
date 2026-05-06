import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void testFormatName_firstLastIsCorrect() {
        //arrange
        String expectedName = "Tang, Andy";

        //act
        String testFormatter = NameFormatter.format("Andy", "Tang");
        //assert
        assertEquals(expectedName, testFormatter);

    }

    @Test
    public void testFormatName_noPrefix_includesFirstMiddleLastAndSuffix() {
        String expectedName = "Johnson, Mel B, PhD";

        String testFormatter = NameFormatter.format("", "Mel", "B", "Johnson", "PhD");

        assertEquals(expectedName, testFormatter);
    }

    @Test
    public void testFormatName_includesAllPrefixFirstMiddleLastSuffix(){
        String expectedName = "Johnson, Dr. Mel B, PhD";

        String testFormatter = NameFormatter.format("Dr", "Mel", "B", "Johnson", "PhD");

        assertEquals(expectedName, testFormatter);
    }
}