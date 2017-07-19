package com.jorjao81.wortschatz;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestCard {

    @Test
    public void basicApi() {
        WordCard word = new WordCard();

        word.setSource("helicóptero");
        word.setTarget("Hubschrauber");

        assertThat(word.verify("hubsc"), is(false));
        assertThat(word.verify("Hubschrauber"), is(true));
    }
}
