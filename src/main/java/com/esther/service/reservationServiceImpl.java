package com.esther.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.esther.dao.ReservationDao;
import com.esther.model.ReservationVO;
@Repository
public class reservationServiceImpl  implements ReservationService{
	@Inject
	private ReservationDao dao;

	@Override
	public List<ReservationVO> selectAll() throws Exception {
		
		return dao.selectAll();
	}

	@Override
	public int insertReserv(ReservationVO vo) {
		
		try {
			return  dao.insertReserv(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}
	
}
