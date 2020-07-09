package com.firenay.boot;

import com.firenay.boot.entity.Emp;
import com.firenay.boot.entity.Student;
import com.firenay.boot.mapper.EmpMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.util.List;


import com.firenay.boot.entity.Student;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootIntegrationApplicationTests {

	Logger logger = LoggerFactory.getLogger(SpringBootIntegrationApplicationTests.class);
	@Resource
	private EmpMapper empMapper;

//	@Autowired
//	private Student student;

//	@Test
//	public void testReadYaml(){
//		logger.debug(student.toString());
//	}

	@Value("${atguigu.best.wishes}")
	private String wishes;

	@Test
	public  void testReadSimpleValue(){
		logger.info(wishes);
	}

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

//	private Logger logger = LoggerFactory.getLogger(SpringBootIntegrationApplicationTests.class);

	@Test
	public void testSelectAll() {
		List<Emp> selectAll = empMapper.selectAll();
		for (Emp emp : selectAll) {
			logger.info("\n" + emp.toString());
		}
	}

	@Test
	public void testRedisTemplate() {
		redisTemplate.opsForValue().set("SpringBoot-redis", "Lijiale");
	}

	@Test
	public void testStringRedisTemplate() {
		String value = stringRedisTemplate.opsForValue().get("SpringBoot-redis");
		logger.info("\n从redis查询到：" +  value);
	}

	@Test
	public void testListOperation(){
		ListOperations<String,String> opsForList = stringRedisTemplate.opsForList();

		opsForList.leftPush("fruit","apple");
		opsForList.leftPush("fruit","banana");
		opsForList.leftPush("fruit","orange");

	}
}
