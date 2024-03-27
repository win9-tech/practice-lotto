package view;

import controller.LottoController;
import controller.LottoControllerImpl;
import model.Lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    System.out.println("\n"+amount+"개를 구매했습니다.");
    }

    public void outputGetLotto() {
        List<Lotto> lottoList = controller.getLotto();
        lottoList.stream().forEach(lotto -> System.out.println(lotto.getLotto()));
    }
}