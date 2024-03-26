package repository;

public class LottoRepositoryImpl implements LottoRepository{

    static final int divideValue = 1000;
    @Override
    public int purchaseAmount(int price) {

        return price/divideValue;
    }
}
