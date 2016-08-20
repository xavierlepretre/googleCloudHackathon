package myapp.service;

import myapp.model.Position;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Position: maciek
 * Date: 8/20/16
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CommonService {

    List<Position> getAllPositions(String name);
}
