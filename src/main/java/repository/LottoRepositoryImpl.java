package repository;

import model.Lotto;

import java.util.List;

public class LottoRepositoryImpl implements LottoRepository{

    static final int divideValue = 1000;
    private List<Lotto> list;
    @Override
    public int purchaseAmount(int price) {

        return price/divideValue;
    }

    @Override
    public void createLotto(List<Lotto> list) {
        this.list = list;
    }

    @Override
    public List<Lotto> getLotto() {
        return list;
    }
}
