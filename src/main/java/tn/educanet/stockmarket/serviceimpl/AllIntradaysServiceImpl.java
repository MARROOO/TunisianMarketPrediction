package tn.educanet.stockmarket.serviceimpl;

import javax.annotation.Resource;



import org.springframework.stereotype.Service;
import tn.educanet.stockmarket.dao.AllIntradaysDao;
import tn.educanet.stockmarket.persistence.AllIntradays;
import tn.educanet.stockmarket.persistence.Intraday;
import tn.educanet.stockmarket.service.AllIntradaysService;


@Service
public class AllIntradaysServiceImpl implements AllIntradaysService {
	
   @Resource
   private AllIntradaysDao allIntradaysDao;
   @Override
   public Intraday saveIntradays(Intraday Intraday) {
	   
	   try {
		   Intraday = allIntradaysDao.save(Intraday);
//		   System.out.println("intradays");
		} catch (Exception e) {
			e.printStackTrace();
			Intraday=new Intraday();



	}
	return Intraday;
   }}
