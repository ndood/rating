package kg.ksucta.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import kg.ksucta.domain.mark.Mark;
import kg.ksucta.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marks")
public class MarkController {
    @Autowired
    MarkService markService;


    @RequestMapping(value = "/course/{course}", method = RequestMethod.GET)
    public List<Mark> getByCourse(@PathVariable("course") String course)  {
        List<Mark> marksByCourse = markService.getByCourse(course);
        return marksByCourse;
    }

    @RequestMapping(value = "/groupname/{groupname}", method = RequestMethod.GET)
    public List<Mark> getByGroupName(@PathVariable("groupname") String groupName) {
        List<Mark> marksByGroupName = markService.getByGroupName(groupName);
        return marksByGroupName;
    }

    @RequestMapping(value = "/username/{username}", method = RequestMethod.GET)
    public List<Mark> getByUserName(@PathVariable("username") String userName){
        List<Mark> marksByUserName = markService.getByUserName(userName);
        return marksByUserName;
    }
    @RequestMapping(value = "/userid/{userId}", method = RequestMethod.GET)
    public List<Mark> getByUserId(@PathVariable("userId") Long userId){
        List<Mark> marksByUserId = markService.getByUserId(userId);
        return marksByUserId;
    }
    @RequestMapping(value = "/userid/{userid}&semester/{semester}", method = RequestMethod.GET)
    public List<Mark> getByUserIdAndSemester(@PathVariable("userid") Long userId,
                                             @PathVariable("semester") Long semester) {
        List<Mark> marksByUserIdAndSemester = markService.getByUserIdAndSemester(userId, semester);
        return marksByUserIdAndSemester;
    }
    @RequestMapping(value = "/username/{username}&semester/{semester}", method = RequestMethod.GET)
    public List<Mark> getByUserNameAndSemester(@PathVariable("username") String userName,
                                               @PathVariable("semester") Long semester){
        List<Mark> marksByUserNameAndSemester = markService.getByUserNameAndSemester(userName, semester);
        return marksByUserNameAndSemester;
    }

    //produces={"application/json"}


    /*@RequestMapping(method = RequestMethod.GET)
    public List<Mark> getByGroupName(@PathVariable("groupName") String groupName){
        List<Mark> marksByGroupName = markService.getByGroupName(groupName);
        return marksByGroupName;
    }*/

    /*@RequestMapping(value = "/{group}", method = RequestMethod.GET)
    public Mark getByGroup(@PathVariable("group") Group group){
        List<Mark> marksByGroup = markService.getByUserGroup(group);
        return marksByGroup.get(1);
    }*/
    /*@RequestMapping(value = "/coursed/{course}", method = RequestMethod.GET)
    public Mark getByCoursed(@PathVariable("course") String course){
        List<Mark> marksByCourse = markService.getByUserGroupCourse(course);
        return marksByCourse.get(1);
    }*/

    //@RequestMapping(value = "/{user}")
}
