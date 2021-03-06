package com.learn.seckill.service;

import com.learn.seckill.dao.GoodMapper;
import com.learn.seckill.mutildatasource.DataSource;
import com.learn.seckill.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class GoodService {
    @Autowired
    private GoodMapper goodMapper;

    @DataSource("slave")
    public List<GoodsVo> selectAllGood() {
        return goodMapper.selectAllGood();
    }
    @DataSource("slave")
    public GoodsVo selectSeckillGoodById(long goodsId) {
        return goodMapper.selectSeckillGoodById(goodsId);
    }

    @DataSource
    public boolean reduceStock(long goodsId) {
        int result = goodMapper.reduceStock(goodsId);
        return result > 0;
    }

}
