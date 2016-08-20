package myapp.service.impl;

import java.util.List;

import myapp.model.LongLat;
import myapp.model.Position;
import myapp.repository.PositionRepository;
import myapp.service.CommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created with IntelliJ IDEA.
 * Position: maciek
 * Date: 8/20/16
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private PositionRepository positionRepository;

    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }

	public LongLat getLastLongLat() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveLongLat(LongLat pos) {
		// TODO Auto-generated method stub
		
	}
}
