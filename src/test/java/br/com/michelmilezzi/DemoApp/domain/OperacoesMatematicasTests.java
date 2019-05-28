package br.com.michelmilezzi.DemoApp.domain;

import java.math.BigDecimal;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperacoesMatematicasTests {
	
	@Test
    public void somaTests() {
        BigDecimal vl1 = (BigDecimal.valueOf(5));
        BigDecimal vl2 = (BigDecimal.valueOf(10));
        BigDecimal vl3 = (BigDecimal.valueOf(15));
        
        Assertions.assertThat(OperacoesMatematicas.somar(vl1, vl2, vl3))
                .isEqualByComparingTo(BigDecimal.valueOf(30));
    }
}
