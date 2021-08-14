package 设计模式.teacher.creator.build;

/**
 * 描述:
 * 计算机
 *
 * @author chongguanpeng
 * @create 2019-10-21 09:02
 */
public class Computer {

    private Long id;

    private String keyboard;

    private String mouse;

    private String screen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public static class Builder {

        public Builder() {
            System.out.println("新建builder");
        }

        private Long id;

        private String keyboard;

        private String mouse;

        private String screen;

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getKeyboard() {
            return keyboard;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public String getMouse() {
            return mouse;
        }

        public Builder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public String getScreen() {
            return screen;
        }

        public Builder setScreen(String screen) {
            this.screen = screen;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer();
            computer.setId(this.getId());
            computer.setKeyboard(this.getKeyboard());
            computer.setMouse(this.getMouse());
            computer.setScreen(this.getScreen());
            return computer;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
