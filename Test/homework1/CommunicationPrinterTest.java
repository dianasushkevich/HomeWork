package homework1;
import org.junit.jupiter.api.Test;
import src.CommunicationPrinter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommunicationPrinterTest {

    @Test
    public void testVasya() {
        CommunicationPrinter printer = new CommunicationPrinter();
        String name = "Вася";
        String expectedWelcome = "Привет!\nЯ тебя так долго ждал";

        String actualWelcome = printer.welcome(name);

        assertEquals(expectedWelcome, actualWelcome);
    }

    @Test
    public void testAnastasia() {
        CommunicationPrinter printer = new CommunicationPrinter();
        String name = "Анастасия";
        String expectedWelcome = "Я тебя так долго ждал";

        String actualWelcome = printer.welcome(name);

        assertEquals(expectedWelcome, actualWelcome);
    }

    @Test
    public void testIvan() {
        CommunicationPrinter printer = new CommunicationPrinter();
        String name = "Иван";
        String expectedWelcome = "Добрый день, а вы кто?";

        String actualWelcome = printer.welcome(name);

        assertEquals(expectedWelcome, actualWelcome);
    }
}