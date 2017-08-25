package com.dimas.maryanto.test;

import com.dimas.maryanto.BungaTabungan;
import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;

public class BungaTabunganTest extends TestCase {

    private BungaTabungan hitung;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.hitung = new BungaTabungan();
    }

    @Test
    public void testBungaTabungan() {
        BigDecimal bungaTabungan = hitung.caraHitungBungaTabungan(new BigDecimal(1000), 2);
        assertEquals(new BigDecimal(2000), bungaTabungan);
    }
}
