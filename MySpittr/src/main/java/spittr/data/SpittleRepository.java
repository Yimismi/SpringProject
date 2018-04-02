package spittr.data;

import java.util.*;
import spittr.*;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
}
