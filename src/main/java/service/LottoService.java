package service;

import model.Lotto;

import java.util.List;

public interface LottoService {


    // 구입 금액 입력 처리
    public int purchaseAmount(int price);

    public void createLotto(int amount);

    public List<Lotto> getLotto();
    //당첨 번호 입력 처리
    public void winningAmount();

    //보너스 번호 입력 처리
    public void bonusNumber();

    //당첨 비교 처리
    public void compareWinning();

    //수익률 처리
    public void rateReturn();



}
