package org.acme;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DefaultMessageProviderTest {

    private MessageProvider provider = new DefaultMessageProvider();

    @Test
    public void shouldGetTheMessage() {
        assertThat(provider.message(), is("Hello World!"));
    }

    @Test
    @Ignore
    public void shouldGetTheWrongMessage() {
        assertThat(provider.message(), is("Hello Girls!"));
    }
}
