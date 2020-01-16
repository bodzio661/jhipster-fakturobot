package com.sion0909.fakturobot.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.sion0909.fakturobot.web.rest.TestUtil;

public class KontrachentTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Kontrachent.class);
        Kontrachent kontrachent1 = new Kontrachent();
        kontrachent1.setId(1L);
        Kontrachent kontrachent2 = new Kontrachent();
        kontrachent2.setId(kontrachent1.getId());
        assertThat(kontrachent1).isEqualTo(kontrachent2);
        kontrachent2.setId(2L);
        assertThat(kontrachent1).isNotEqualTo(kontrachent2);
        kontrachent1.setId(null);
        assertThat(kontrachent1).isNotEqualTo(kontrachent2);
    }
}
