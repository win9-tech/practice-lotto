package service;

import repository.LottoRepository;
import repository.LottoRepositoryImpl;
import view.OutputView;

public class LottoServiceImpl implements LottoService{

    static final LottoService lottoService = new LottoServiceImpl();
    LottoRepository lottoRepository = new LottoRepositoryImpl();
    public static LottoService lottoService(){
        return lottoService;
    }

    @Override
    public int purchaseAmount(int price) {

        return lottoRepository.purchaseAmount(price);
    }

    @Override
    public void createLotto(int amount) {

        for(int i = 0; i<amount; i++){

        }

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
