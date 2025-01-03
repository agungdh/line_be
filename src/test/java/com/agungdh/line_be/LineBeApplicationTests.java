package com.agungdh.line_be;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class LineBeApplicationTests {

    @Test
    void contextLoads() {
    }

}
