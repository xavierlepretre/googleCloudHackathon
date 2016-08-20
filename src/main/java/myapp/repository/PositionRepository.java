package myapp.repository;

import myapp.model.Position;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created with IntelliJ IDEA.
 * Position: maciek
 * Date: 8/20/16
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PositionRepository extends MongoRepository<Position, String> {

}
