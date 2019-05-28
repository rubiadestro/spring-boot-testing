package br.com.michelmilezzi.DemoApp.domain;

import java.math.BigDecimal;

public class OperacoesMatematicas {
	
	BigDecimal vl1, vl2, vl3;

	public BigDecimal getVl1() {
		return vl1;
	}

	public BigDecimal getVl2() {
		return vl2;
	}

	public BigDecimal getVl3() {
		return vl3;
	}

	public static BigDecimal somar(BigDecimal vl1, BigDecimal vl2, BigDecimal vl3) {
		return vl1.add(vl2).add(vl3);		
	}
}
