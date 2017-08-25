package com.dimas.maryanto;

import java.math.BigDecimal;

public class BungaTabungan {

    public BigDecimal caraHitungBungaTabungan(BigDecimal saldo, Integer hari) {
        return saldo.multiply(new BigDecimal(hari));
    }
}
