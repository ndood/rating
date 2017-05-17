package kg.ksucta;

import kg.ksucta.domain.Group;
import kg.ksucta.service.GroupServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hibernate.jpa.internal.EntityManagerImpl.LOG;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagmentApplicationTests {
	@Autowired
	private GroupServiceImpl groupService;
	@Test
	public void testGetByCourse(){
		LOG.info("******Get By Course*******");
		Iterable<Group> groupByCourse = groupService.getByCourse("IG-14");
		for (Group group: groupByCourse){
			LOG.info(group.getGroupname());
		}

		LOG.info("**************************");
	}
	@Test
	public void contextLoads() {

	}

}
