package repository;

import model.Lotto;

import java.util.List;

public interface LottoRepository {
    int purchaseAmount(int price);

    void createLotto(List<Lotto> list);

    List<Lotto> getLotto();
}
