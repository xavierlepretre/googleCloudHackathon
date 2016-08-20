package myapp.service.impl;

import java.util.List;

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

    @Override
    public List<Position> getAllPositions(String name) {
        return positionRepository.findAll();
    }
}
