package eu.xenit.contentcloud.userapps.holmes.dcm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
		"spring.content.storage.type.default=fs"
})
class DcmApiApplicationTests {

	@Test
	void contextLoads() {
	}

}
