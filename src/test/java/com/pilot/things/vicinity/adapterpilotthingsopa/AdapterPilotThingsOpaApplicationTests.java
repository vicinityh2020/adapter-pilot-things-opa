package com.pilot.things.vicinity.adapterpilotthingsopa;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

import com.pilot.things.vicinity.adapterpilotthingsopa.data.vicinity.PropertyValue;
import com.pilot.things.vicinity.adapterpilotthingsopa.exception.AdreamAPIException;
import com.pilot.things.vicinity.adapterpilotthingsopa.service.AdapterService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.slf4j.LoggerFactory.getLogger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdapterPilotThingsOpaApplicationTests {

	static final Logger LOGGER = getLogger(AdapterPilotThingsOpaApplicationTests.class);

	@Autowired
	AdapterService api;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testApi() throws IOException, NoSuchAlgorithmException, KeyStoreException, KeyManagementException, AdreamAPIException {
		PropertyValue result = this.api.getData();

		LOGGER.debug("{}",result.getValue());
		Assert.assertNotNull(result.getValue());
	}

}
