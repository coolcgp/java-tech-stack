package com.ranger.creator.singleton;

/**
 * 描述:
 * holder模式
 *
 * @author chongguanpeng
 * @create 2019-10-15 08:41
 */
public class HolderSingleton {

    /**
     * 账号
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    private HolderSingleton() {
        userName = "guanniao";
        password = "123456";
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    private static class Holder {
        public static HolderSingleton holderSingleton = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return Holder.holderSingleton;
    }

    @Override
    public String toString() {
        return "HolderSingleton{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
