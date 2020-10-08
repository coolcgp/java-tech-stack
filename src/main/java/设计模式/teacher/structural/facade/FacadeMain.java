package com.ranger.structural.facade;

/**
 * 描述:
 * 门面入口
 *
 * @author chongguanpeng
 * @create 2019-10-16 09:20
 */
public class FacadeMain {

    QualifyService qualifyService = new QualifyService();
    PayService payService = new PayService();
    ShipService shipService = new ShipService();

    public boolean exchangeGift(User user, Gift gift) {
        boolean rst = false;
        //检查用户和礼物信息略
        if (qualifyService.qualify(user, gift)) {
            if (payService.pay(user, gift, 10)) {
                rst = shipService.send(user, gift);
            }
        }
        return rst;
    }

}
