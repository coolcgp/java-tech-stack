package 设计模式.teacher.structural.facade;


/**
 * 描述:
 * 支付
 *
 * @author chongguanpeng
 * @create 2019-10-16 09:17
 */
public class PayService {

    public boolean pay(User user, Gift gift, Integer coinNum) {
        System.out.println(user.getUserName() + "用" + coinNum + "积分换了" + gift.getName());
        return true;
    }

}
