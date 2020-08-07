package com.example.service.ymj;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.SettlementMapper;
import com.example.pojo.Settlement;

@Service
//@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class IndexBiz {

	@Autowired
	private SettlementMapper setlementmapper;
	
//	public Settlement selectByDayMoney(Date paymenttime) {
//		return setlementmapper.selectByDayMoney(paymenttime);
//	}
//	
//	public List<Settlement>  query(){
//		return this.setlementmapper.query();
//	}
}
