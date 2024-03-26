package view;

import controller.LottoController;
import controller.LottoControllerImpl;

public class OutputView {

    static final OutputView outputView = new OutputView();
    LottoController controller = new LottoControllerImpl();
    public static OutputView getOutputView(){
        return outputView;
    }
    
    public void outputPurchaseAmount(){
        System.out.println("당첨 금액을 입력해주세요");
    }
    public void outputPurchaseResult(int amount){

    controller.createLotto(amount);

    }
}
