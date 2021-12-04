package proxy.staticproxy;

/**
 * @author yuanyu
 * @title: StarProxy
 * @description: TODO
 * @date 2021/9/1 10:16
 */
public class StarProxy implements IStar {
    /**
     * 注入目标对象
     */
    private JayChou jay;

    public StarProxy(JayChou jay) {
        this.jay = jay;
    }

    public void sing() {
        System.out.println("上台前准备~");
        jay.sing();
        System.out.println("跟歌迷挥手再见~");
    }
}
