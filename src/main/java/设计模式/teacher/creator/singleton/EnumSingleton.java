package com.ranger.creator.singleton;

/**
 * 描述:
 * 枚举类型的单例
 *
 * @author chongguanpeng
 * @create 2019-10-15 08:56
 */
public class EnumSingleton {

    /**
     * 账号
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    private EnumSingleton(String userName, String password) {
        this.userName = userName;
        this.password = password;
        // new client
    }

    public String requestSever(String sql) {
        // 依据当前的client执行代码
        return "SUCCESS";
    }

    private enum OSSEnum {

        CLUB("冠鸟","123456");

        private EnumSingleton enumSingleton;

        OSSEnum(String userName, String password) {
            enumSingleton = new EnumSingleton(userName, password);
        }

        public EnumSingleton getEnumSingleton() {
            return enumSingleton;

        }
    }

    public static EnumSingleton getInstance(){
        return OSSEnum.CLUB.getEnumSingleton();
    }

}
