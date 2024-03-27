package controller;

import model.Lotto;
import service.LottoService;
import service.LottoServiceImpl;

import java.util.List;

public class LottoControllerImpl implements LottoController{

    static final LottoController lottoController = new LottoControllerImpl();
    LottoService lottoService = new LottoServiceImpl();
    public static LottoController getlottoController(){
        return lottoController;
    }

    @Override
    public int purchaseAmount(int price) {
        return lottoService.purchaseAmount(price);
    }

    @Override
    public void createLotto(int amount) {
        lottoService.createLotto(amount);
    }
    @Override
    public List<Lotto> getLotto() {
        return lottoService.getLotto();
    }

    @Override
    public void winningAmount() {

    }

    @Override
    public void bonusNumber() {

    }

    @Override
    public void compareWinning() {

    }

    @Override
    public void rateReturn() {

    }


}
