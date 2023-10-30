package task14;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void test_1() {
        Book book1 = new Book("MyCoolBook", "CoolAuthor", 1488);
        Object book2 = book1.clone();
        Assert.assertEquals(book2, book1);
    }
}