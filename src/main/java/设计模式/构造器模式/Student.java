package 设计模式.构造器模式;

/**
 * @program: java-tech-stack
 * @description: 构造器学生类
 * @author: scl chongguanpeng coolcgp@163.com wechat: GeorgeChongVIP
 * @create: 2020-12-22 07:54
 **/
public class Student {

    /**
     * 姓名
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static class Builder{

        public Builder(){

        }

        /**
         * 姓名
         */
        private String name;

        /**
         * 地址
         */
        private String address;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build(){
            Student student = new Student();
            student.setName(this.name);
            student.setAddress(this.address);
            return student;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Builder builder = new Student.Builder();
        Student student = builder.setName("zhangsan").setAddress("郑州大学北校区").build();
        System.out.println(student);
    }

}
