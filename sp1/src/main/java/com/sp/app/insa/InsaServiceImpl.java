package com.sp.app.insa;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class InsaServiceImpl implements InsaService {

	@Override
	public String belt(Insa dto) {
		int y = Integer.parseInt(dto.getBirth().substring(0, 4));
		int ybelt = y%12; 
		
		String[] belt = {"원숭이", "닭", "개", "돼지", "쥐", "소", 
		               "호랑이", "토끼", "용", "뱀", "말", "양"};
		
		return belt[ybelt];
	}

	@Override
	public int age(Insa dto) {
		LocalDateTime now = LocalDateTime.now();
		
		int nowYear = now.getYear();
		
		String fullBirth = dto.getBirth();
		String year = fullBirth.substring(0, 4);
		//String month = fullBirth.substring(5,7);
		// 생일지나야 1살 추가 하는 로직 추가하기 
		
		int y = Integer.parseInt(year);
		int age = nowYear - y + 1;
		
		
		return age;
	}

	@Override
	public int tax(Insa dto) {
		
		int total = dto.getSalary() + dto.getBonus();
		int tax = 0;
		
		if(total >= 3000000) {
			tax = (int) (total*0.03);
		} else if(total >= 2000000) {
			tax = (int) (total*0.02);
		}
		
		return tax;
	}

	@Override
	public int realSalary(Insa dto) {
		int tax = tax(dto);
		int rSal = dto.getSalary() + dto.getBonus() - tax;
		
		return rSal;
	}

	

}
