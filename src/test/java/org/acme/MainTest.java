package org.acme;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    private Main main = new Main();

    @Test
    public void shouldGetTheMessage() {
        assertThat(main.message(), is("Hello World!"));
    }

    @Test
    @Ignore
    public void shouldGetTheWrongMessage() {
        assertThat(main.message(), is("Hello Girls!"));
    }
}
