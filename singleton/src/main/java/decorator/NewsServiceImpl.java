package decorator;

public class NewsServiceImpl implements NewsService {


    public  OldService oldService;

    public NewsServiceImpl() {
    }

    public NewsServiceImpl(OldService oldService) {
        this.oldService = oldService;
    }

    @Override
    public void register() {
        oldService.register();
    }

    @Override
    public void login() {
        oldService.login();
    }
}
