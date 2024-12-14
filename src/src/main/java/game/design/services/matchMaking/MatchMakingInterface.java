package game.design.services.matchMaking;


import game.design.models.MatchDO;

import java.util.ArrayList;
import java.util.List;

public interface MatchMakingInterface {

    //now this funciton will be called after a fixed interval. I could maintain queue at service level
    //but that approach wont work at distributed system
    public List<MatchDO> findMatch();

}
