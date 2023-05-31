package com.sp.app.calc;

import org.springframework.stereotype.Service;

// @Service 붙여야 객체 생성됨 
@Service 
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public String result(Calculator dto) {
		String s = null;
		
		switch(dto.getOperator()) {
		case "+" : s = String.format("%d + %d = %d", 
				dto.getNum1(), dto.getNum2(), dto.getNum1() + dto.getNum2());
					break;
		case "-" : s = String.format("%d - %d = %d", 
				dto.getNum1(), dto.getNum2(), dto.getNum1() - dto.getNum2());
					break;
		case "*" : s = String.format("%d * %d = %d", 
				dto.getNum1(), dto.getNum2(), dto.getNum1() * dto.getNum2());
					break;
		case "/" : s = String.format("%d / %d = %d", 
				dto.getNum1(), dto.getNum2(), dto.getNum1() / dto.getNum2());
					break;
					
		}
		
		return s;
	}

}
