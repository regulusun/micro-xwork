package cn.fund123.lion.transport;

/**
 * @author paulwalker4rip@gmail.com
 * @version 1/24/14 Time: 3:56 PM
 */
public class HelloAction {
    private String name;
    public String execute() {
        System.out.println("hello " + name);
        System.out.println("hello action invoke");
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
