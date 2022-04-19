import cn.zqph1002.business.BusinessService;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BusinessService businessService = new BusinessService();

        while (true){
            Thread.sleep(5000);
            businessService.doBusiness();
        }

    }
}
