package 设计模式.teacher.structural.facade;


/**
 * 描述:
 * 礼物
 *
 * @author chongguanpeng
 * @create 2019-10-16 09:11
 */
public class Gift {

    private String name;

    public Gift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
