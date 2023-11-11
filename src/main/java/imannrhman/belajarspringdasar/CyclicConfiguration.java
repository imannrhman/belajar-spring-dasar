package imannrhman.belajarspringdasar;

import imannrhman.belajarspringdasar.cyclic.CyclicA;
import imannrhman.belajarspringdasar.cyclic.CyclicB;
import imannrhman.belajarspringdasar.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;

public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }


    @Bean
    public CyclicC cyclicB(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }
}
