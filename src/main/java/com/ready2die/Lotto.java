package com.ready2die;

import java.util.Set;

public class Lotto {

    private static final int LOTTO_SIZE = 6;

    private final Set<LottoNumber> lotto;

    public Lotto(Set<LottoNumber> lotto) {

        if (lotto.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException();
        }

        this.lotto = lotto;
    }
}
