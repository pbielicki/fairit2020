package org.acme;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MessageTest {

    private Message message = new Message();

    @Test
    public void shouldGetTheMessage() {
        var x = 123;
        assertThat(x, is(123));
        assertThat(message.message(), is("Hello World!"));
    }

    @Test
    @Ignore
    public void shouldGetTheWrongMessage() {
        assertThat(message.message(), is("Hello Girls!"));
    }
}
