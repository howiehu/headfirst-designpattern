/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LibraryTest {
    @Test
    @DisplayName("someLibraryMethod should return 'true'")
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertThat(classUnderTest.someLibraryMethod()).isTrue();
    }
}
