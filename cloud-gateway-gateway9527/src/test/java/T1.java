import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

/**
 * @author rockie
 * @createTime 2021-04-10 1:17
 */
@SpringBootTest
@Slf4j
public class T1 {
    @Test
    void DateTime(){
        ZonedDateTime now = ZonedDateTime.now();
        log.info("现在时间："+now);
    }
}
