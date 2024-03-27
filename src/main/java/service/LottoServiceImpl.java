package service;

import camp.nextstep.edu.missionutils.Randoms;
import controller.LottoControllerImpl;
import model.Lotto;
import repository.LottoRepository;
import repository.LottoRepositoryImpl;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

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
        List<Lotto> list = new ArrayList<>();
        for(int i = 0; i<amount; i++){
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            Lotto lotto = new Lotto(numbers);
            list.add(lotto);
        }
            lottoRepository.createLotto(list);
    }

    @Override
    public List<Lotto> getLotto() {
        return lottoRepository.getLotto();
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
