package game.design.services.leaderboard;

import game.design.models.Player;
import game.design.models.RankDO;

import java.util.ArrayList;
import java.util.List;

public class LeaderBoardService {
/*
* 1. get My Rank
* 2. Get overall rank
* 3. Time based rank
*
* */

    RankDO getMyRank(Player p1){
        return new RankDO();
    }

    List<RankDO> getAllRank(Player p1){
        return new ArrayList<>();
    }
}
