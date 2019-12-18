package reference;

/**
 * 描述：
 *
 * @author zy
 * @date 2019/12/17 20:53
 */
public class MyProject {
    private String name;

    private String content;

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public void finalize() {
//        System.out.println("Finalizing VeryBig ");
//    }
}
