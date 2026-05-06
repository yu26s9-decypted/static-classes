import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void testFormatNameBeforeFormatted_firstLastIsCorrect() {
        //arrange
        String expectedName = "Andy Tang";

        //act
        String testFormatter = NameFormatter.format("Andy", "Tang");
        //assert
        assertEquals(expectedName, testFormatter);

    }

    @Test
    public void testFormatNameBeforeFormatted_noPrefix_includesFirstMiddleLastAndSuffix() {
        String expectedName = "Mel B Johnson, PhD";

        String testFormatter = NameFormatter.format("", "Mel", "B", "Johnson", "PhD");

        assertEquals(expectedName, testFormatter);
    }

    @Test
    public void testFormatNameBeforeFormatted_includesAllPrefixFirstMiddleLastSuffix(){
        String expectedName = "Dr. Mel B Johnson, PhD";

        String testFormatter = NameFormatter.format("Dr", "Mel", "B", "Johnson", "PhD");

        assertEquals(expectedName, testFormatter);
    }
}