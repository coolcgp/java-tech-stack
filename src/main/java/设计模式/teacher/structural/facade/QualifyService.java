package 设计模式.teacher.structural.facade;


/**
 * 描述:
 * 鉴权服务
 *
 * @author chongguanpeng
 * @create 2019-10-16 09:12
 */
public class QualifyService {

    public boolean qualify(User user,Gift gift){
        System.out.println(user.getUserName() +"有资格和足够积分，申请换取"+gift.getName());
        return true;
    }

}
