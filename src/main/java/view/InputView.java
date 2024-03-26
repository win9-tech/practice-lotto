package view;

import controller.LottoController;
import controller.LottoControllerImpl;

public class InputView {

    static final InputView inputView = new InputView();
    LottoController lottoController = new LottoControllerImpl();
    public static InputView getInputView(){
        return inputView;
    }
    // 구입 금액 입력 처리
    public int InputPurchaseAmount(String input){
        int price = Integer.parseInt(input);
        validatePriceRest(price);
        validatePriceMin(price);
        return lottoController.purchaseAmount(price);
    }

    //당첨 번호 입력 처리
    public void winningAmount(){

    }

    //보너스 번호 입력 처리
    public void bonusNumber(){

    }

    //당첨 비교 처리
    public void compareWinning(){

    }

    //수익률 처리
    public void rateReturn(){

    }
    private void validatePriceRest(int price) {
        try {
            if (price % 1000 != 0) {
                throw new IllegalArgumentException("[ERROR]");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    private void validatePriceMin(int price) {
        try {
            if (price < 1000) {
                throw new IllegalArgumentException("[ERROR] = 입력금액 오류");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
