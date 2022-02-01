package ic.doc;

import static junit.framework.TestCase.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;

import org.junit.Test;

public class RecentlyUsedListTest {

    RecentlyUsedList<String> recentlyUsedList = new RecentlyUsedList<>();

    @Test
    public void listEmptyWhenInitialized() {
        assertTrue(recentlyUsedList.isEmpty());
    }

    @Test
    public void addThingToList() {
        recentlyUsedList.add("New item");
        assertTrue(recentlyUsedList.contains("New item"));
    }

    @Test
    public void retrieveFromList() {

        recentlyUsedList.add("New item");
        recentlyUsedList.add("Newer item");
        String frontOfList = recentlyUsedList.get(0);
        String secondInList = recentlyUsedList.get(1);
        assertEquals("New item", secondInList);
        assertEquals("Newer item", frontOfList);

    }

    @Test
    public void throwsExceptionWhenRetrieveIndexNotInList() {

        try {
            String frontOfList = recentlyUsedList.get(0);
            fail("Should have thrown exception");
        } catch (IndexOutOfBoundsException ioob) {
            assertThat(ioob.getMessage(), containsString("0"));
        }
    }

    @Test
    public void mostRecentItemIsFirstInList() {

        recentlyUsedList.add("New item");
        recentlyUsedList.add("Newer item");
        String frontOfList = recentlyUsedList.getFirst();
        assertEquals("Newer item", frontOfList);
    }

    @Test
    public void itemsInListAreUnique() {

        recentlyUsedList.add("New item");
        recentlyUsedList.add("New item");
        int occurrences = recentlyUsedList.countItem("New item");
        assertThat(occurrences, is(1));

    }

    @Test
    public void canHaveListOfInts() {

        RecentlyUsedList<Integer> integerList = new RecentlyUsedList<>();
        integerList.add(1);
        integerList.add(1);
        int occurrences = integerList.countItem(1);
        assertThat(occurrences, is(1));

    }

}
