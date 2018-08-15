package decorator;

public class TestMain {
    public static void main(String[] args) {
        //装饰模式
        //应用场景 ： 不修改原有业务接口 来 扩展 老接口 或 覆盖
        NewsService newsService = new NewsServiceImpl(new OldServiceImpl());
        newsService.login();
    }
}
