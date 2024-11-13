package com.xiaobaicai.web;

import com.xiaobaicai.web.dataobject.UserDO;
import com.xiaobaicai.web.service.UserDaoService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebSpringBoot3ApplicationTests {

	@Resource
	public UserDaoService userDaoService;

	@Test
	public void testMBG() {
		UserDO byId = userDaoService.getById(11);
	}

}

