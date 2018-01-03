package xmu.crms.view.vo;

import xmu.crms.entity.SeminarGroup;
import xmu.crms.entity.Topic;

import java.math.BigInteger;

/**
 * Created by huxingbo on 1/3/18.
 */
public class GroupUserGradeVO {
    //groupId与topicId唯一确定一次打分对象
    private BigInteger groupId;
    private Topic topic;
    private Integer userGrade;
    //小组的名字=topic.serial+groupId

    public GroupUserGradeVO(SeminarGroup seminarGroup,Topic topic,Integer userGrade){
        this.groupId=seminarGroup.getId();
        this.topic=topic;
        this.userGrade=userGrade;
    }

    public BigInteger getGroupId() {
        return groupId;
    }

    public void setGroupId(BigInteger groupId) {
        this.groupId = groupId;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Integer getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(Integer userGrade) {
        this.userGrade = userGrade;
    }
}
