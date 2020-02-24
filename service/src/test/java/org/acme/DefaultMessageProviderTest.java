package org.acme;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DefaultMessageProviderTest {

    private MessageProvider provider = new DefaultMessageProvider();

    @Test
    public void shouldGetTheMessage() {
        var message = provider.message();
        assertThat(message, is("Hello World!"));
    }

    @Test
    @Disabled
    public void shouldGetTheWrongMessage() {
        assertThat(provider.message(), is("Hello Girls!"));
    }
}
