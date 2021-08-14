package 设计模式.teacher.structural.facade;

/**
 * 描述:
 * 物流
 *
 * @author chongguanpeng
 * @create 2019-10-16 09:14
 */
public class ShipService {

    public boolean send(User user, Gift gift) {
        System.out.println("为用户" + user.getUserName() + "发送" + gift.getName() + "至" + user.getAddress());
        return true;
    }

}
