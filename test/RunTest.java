import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RunTest {
    @ParameterizedTest
    @CsvFileSource(resources = "grades.csv", numLinesToSkip = 1)
    void testObtenerNota(int grade, String expected) {
        assertEquals(expected, Run.obtenerNota(grade));
    }
}
