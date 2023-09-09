package tn.educanet.stockmarket.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.educanet.stockmarket.dao.LimitDao;
import tn.educanet.stockmarket.persistence.AllLimits;
import tn.educanet.stockmarket.persistence.Limit;
import tn.educanet.stockmarket.service.LimitService;

@Service
public class LimitServiceImpl implements LimitService {
    private final LimitDao limitDao;

    @Autowired
    public LimitServiceImpl(LimitDao limitDao) {
        this.limitDao = limitDao;
    }

//    @Override
//    public AllLimits saveLimit(AllLimits limit) {
//        try {
//            limit = limitDao.save(limit);
//        } catch (Exception e) {
//            e.printStackTrace();
//            limit = new AllLimits();
//        }
//        return limit;
//    }

  
    @Override
    public Limit saveLimit(Limit limit) {
        try {
            limit = limitDao.save(limit);
        } catch (Exception e) {
            e.printStackTrace();
            limit = new Limit();
        }
        return limit;
    }
}
