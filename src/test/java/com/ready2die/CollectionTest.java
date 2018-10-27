package com.ready2die;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTest {

    @Test
    public void arrayList() {

        ArrayList<String> values = new ArrayList<String>();
        values.add("first");
        values.add("second");


        assertThat(values.add("third")).isTrue();
        assertThat(values.size()).isEqualTo(3);
        assertThat(values.get(0)).isEqualTo("first");
        assertThat(values.contains("first")).isTrue();
        assertThat(values.remove(0)).isEqualTo("first");
        assertThat(values.size()).isEqualTo(2);
    }
}
