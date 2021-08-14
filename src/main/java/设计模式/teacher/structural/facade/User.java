package 设计模式.teacher.structural.facade;

/**
 * 描述:
 * 用户
 *
 * @author chongguanpeng
 * @create 2019-10-16 09:15
 */
public class User {

    private String userId;

    private String userName;

    private String address;

    private Integer balance;

    public User(String userId, String userName, String address,Integer balance) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
